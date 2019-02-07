provider "aws" {
  profile                 = "${var.profile}"
  shared_credentials_file = "~/.aws/credentials"
  region                  = "${var.aws_region}"
}

resource "aws_security_group" "elk_sec_group" {
  name = "peti_sec_group_elk"

  ingress {
    from_port   = 5601
    to_port     = 5601
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 9200
    to_port     = 9200
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 5044
    to_port     = 5044
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }
}

resource "aws_instance" "elk-runner-test" {
  ami           = "ami-6d27a913"
  instance_type = "t3.medium"
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
    Name = "elk-runner-test"
  }

  provisioner "remote-exec" {
    inline = [
      "sudo yum install -y docker",
      "sudo systemctl enable docker.service",
      "sudo systemctl start docker.service",
      "sudo sysctl -w vm.max_map_count=262144",
      "sudo sysctl -w fs.file-max=65536",
      "sudo docker run -d -p 5601:5601 -p 9200:9200 -p 5044:5044 --name elk-test --ulimit nofile=65536:65536  sebp/elk",
    ]
  }
}

data "template_file" "filebeat-config" {
  template = "${file("${var.workdir_path}/filebeat.yml.template")}"

  vars {
    YOUR_ELK_IP = "${aws_instance.elk-runner-test.public_ip}"
  }
}

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

  provisioner "file" {
    source      = "${var.workdir_path}/elastic.repo"
    destination = "/home/ec2-user/elastic.repo"
  }

  provisioner "file" {
    content     = "${data.template_file.filebeat-config.rendered}"
    destination = "/home/ec2-user/filebeat.yml"
  }

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
