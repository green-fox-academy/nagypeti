provider "aws" {
  profile                 = "${var.profile}"
  shared_credentials_file = "~/.aws/credentials"
  region                  = "${var.aws_region}"
}

resource "aws_instance" "web1" {
  ami           = "ami-6d27a913"
  instance_type = "t3.medium"
  key_name      = "${var.key_name}"

  connection {
    user        = "ec2-user"
    type        = "ssh"
    private_key = "${file(var.private_key_path)}"
  }

  tags {
    Name = "elk-test?"
  }

  provisioner "remote-exec" {
    inline = [
      "sudo yum install -y docker",
      "sudo systemctl enable docker.service",
      "sudo systemctl start docker.service",
      "sudo docker run -p 9000:9000 sonarqube",
    ]
  }
}
