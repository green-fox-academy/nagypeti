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

  provisioner "remote-exec" {
    inline = [
      "sudo yum install -y docker",
      "sudo systemctl enable docker.service",
      "sudo systemctl start docker.service",
    ]
  }

  provisioner "remote-exec" {
    inline = [
      "docker pull docker.elastic.co/beats/filebeat:6.6.0",
      "curl -L -O https://raw.githubusercontent.com/elastic/beats/6.6/deploy/docker/filebeat.docker.yml",
      <<EOF
      sudo docker run \
      --rm \
      docker.elastic.co/beats/filebeat:6.6.0 \
      setup -E setup.kibana.host=${aws_instance.elk-runner-test.public_ip}:5601 \
      -E output.elasticsearch.hosts=[${aws_instance.elk-runner-test.public_ip}:9200]
EOF
      ,
    ]
  }

  provisioner "remote-exec" {
    inline = [<<EOF
      sudo docker run -d \
        --name=filebeat \
        --user=root \
        --volume="$(pwd)/filebeat.docker.yml:/usr/share/filebeat/filebeat.yml:ro" \
        --volume="/var/lib/docker/containers:/var/lib/docker/containers:ro" \
        --volume="/var/run/docker.sock:/var/run/docker.sock:ro" \
        docker.elastic.co/beats/filebeat:6.6.0 filebeat -e -strict.perms=false \
        -E output.elasticsearch.hosts=["${aws_instance.elk-runner-test.public_ip}:9200"]
EOF
    ]
  }
}
