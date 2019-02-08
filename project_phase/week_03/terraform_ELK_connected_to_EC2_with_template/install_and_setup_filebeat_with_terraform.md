# Installing FileBeat with Terraform

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
    YOUR_ELK_IP = "${aws_instance.elk-runner-test.public_ip}"
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
- Add connection:
    - Username (every image has a different userset, AmazonLinux has 'ec2-user' and 'root')
    - Type is ssh
    - We have to add the path to the ssh key (example "/home/user/.ssh/test.pem")
- Tags: name tag is useful to distinguish the running instances

```sh
# /main.tf
resource "aws_instance" "ec2-to-monitor" {
  ami           = "ami-6d27a913"
  instance_type = "t3.micro"
  key_name      = "${var.key_name}"

  security_groups = [
    "peti_sec_group_elk",
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
