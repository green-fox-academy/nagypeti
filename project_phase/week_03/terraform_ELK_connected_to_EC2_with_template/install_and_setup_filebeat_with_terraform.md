# Setting up ELK on EC2 using docker

**First we have to create the EC2 instance which going to host the ELK stack (Elasticsearch, Logstash, Kibana)**

- Define the image, the instance type and the ssh key-pair name
- tags - name the ec2
- Assign EC2 to security group
- connection:
    - username (every image has a different userset, AmazonLinux has 'ec2-user' and 'root')
    - type is ssh
    - private_key - add the path to the ssh key (example "/home/user/.ssh/test.pem")

```sh
# /main.tf
resource "aws_instance" "elk-runner" {
  ami           = "ami-0eaec5838478eb0ba"
  instance_type = "t3.medium"
  key_name = "${var.key_name}"
  
  tags {
    Name = "elk-runner"
      }
  security_groups = [
    "elk-sec-group",
  ]

  connection {
    user        = "ec2-user"
    type        = "ssh"
    private_key = "${file(var.key_path)}"
  }
```
# Installing docker and starting containerized ELK

**We're using provisioner 'remote-exec' to execute commands on remote host**
- Install docker using yum (The Yellowdog Updater, Modified) pacakge manager, update packages before install
- Fire up docker so we can run the container
- sysctl - this command is used to increase available resources for the container
    -  increase the max_map_count kernel parameter to avoid running out of memory-mapped areas
    -  file-max changing the value of how many files can be opened by any running application
- Run the container detached using sebp/elk image and map the ports used by the 3 ELK service
    - --ulimit nofile is used to increase the limit of opened files inside the container
    - Kibana port for example: map TCP port 5601 (right) in the container to port 5601 (left) on the Docker host
 
```sh
  provisioner "remote-exec" {
    inline = [
      "sudo yum update -y",
      "sudo yum install docker -y",
      "sudo service docker start",
      "sudo sysctl -w vm.max_map_count=262144",
      "sudo sysctl -w fs.file-max=65536",
      "sudo docker run -p 5601:5601 -p 9200:9200 -p 5044:5044 --name elk --ulimit nofile=65536:65536 -d sebp/elk",
    ]
  }
}
```


# Installing FileBeat on EC2

#### Using template provider to create filebeat.yml

Template provider is good to create files with fields that can change, like the public IP of an EC2.
In the template file we can define variables, which going to be replaced by the given value, after the template is rendered.

Filebeat reads its setup from the config file. For example:
 - what is the IP of the ELK services (Elasticsearch or Kibana)?
 - which type of parsing should it use? .input or .autodiscover?


```sh
# /main.tf
data "template_file" "filebeat-config" {
  template = "${file("${var.workdir_path}/filebeat.yml.template")}"

  vars {
    YOUR_ELK_IP = "${aws_instance.elk-runner.public_ip}"
  }
}
```
**Run "terraform init" after adding the template_file :)**

**A basic filebeat.yml config file before rendering**

```sh
# /filebeat.yml.template
filebeat.inputs:
- type: log
  enabled: true
  paths:
    - /var/log/*.log
setup.kibana:
  host: "${YOUR_ELK_IP}:5601"
  protocol: "http"
output.elasticsearch:
  hosts: ["${YOUR_ELK_IP}:9200"]
  protocol: "http"
```

#### Setting up a basic instance we want to monitor

- Define the image, the instance type and the ssh key-pair name
- Add the security group
- Connection settings
- Tags: name tag is useful to distinguish the running instances

```sh
# /main.tf
resource "aws_instance" "ec2-to-monitor" {
  ami           = "ami-6d27a913"
  instance_type = "t3.micro"
  key_name      = "${var.key_name}"

  security_groups = [
    "elk-sec-group",
  ]

  connection {
    user        = "ec2-user"
    type        = "ssh"
    private_key = "${file(var.private_key_path)}"
  }

  tags {
    Name = "ec2-to-monitor"
  }
```
### File provisioner - copy files from local to remote

provisioner 'file' is a method to copy files from local to remote host.

it uses 'scp' so we can copy files only to folders which are owned by the ec2-user

**In this step we scp elastic.repo (containg information about filebeat package repository for yum)**
```sh
# /main.tf
  provisioner "file" {
    source      = "${var.workdir_path}/elastic.repo"
    destination = "/home/ec2-user/elastic.repo"
  }
```

**Here we're going to render our template and copy it to the remote machine:**

```sh
# /main.tf
  provisioner "file" {
    content     = "${data.template_file.filebeat-config.rendered}"
    destination = "/home/ec2-user/filebeat.yml"
  }
```

### Install and setup filebeat - The magic happens! :)

**Step by step explanation:**
- rpm - (RedHat package manager) importing GPG-KEY
- mv - moving the repository file into yum.repos.d, yum parses this folder to get repository URL-s for packages
- yum - installing filebeat with yum
- chkconfig - this option adds a new service for management by chkconfig
- mv - changing to root user and executing a single command to move the rendered .yml file to the desired location
- filebeat test config and output - filebeat runs the config based on the .yml file and checks the output
- filebeat setup - now we setting up Kibana dashboards remotly using FileBeat. The trick here is 'sleep'. WE have to delay this command, because to execute is properly, the other instance has o run and Kibana has to be ready to recieve data from FileBeat. So to avoid unpleasent error message, we have to delay the command for some time.
- service - now we starting FileBeat and we can check if Kibana starting to recieve logs. :)
```sh
# /main.tf
  provisioner "remote-exec" {
    inline = [
      "sudo rpm --import https://packages.elastic.co/GPG-KEY-elasticsearch",
      "sudo mv /home/ec2-user/elastic.repo /etc/yum.repos.d/",
      "sudo yum -y install filebeat",
      "sudo chkconfig --add filebeat",
      "sudo su root -c 'mv /home/ec2-user/filebeat.yml /etc/filebeat/'",
      "sudo chown root /etc/filebeat/filebeat.yml",
      "sudo filebeat test config",
      "sudo filebeat test output",
      "sleep 40;sudo filebeat setup --dashboards",
      "sudo service filebeat start",
    ]
  }
}
```
