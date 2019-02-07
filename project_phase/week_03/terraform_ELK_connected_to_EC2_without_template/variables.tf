variable "aws_region" {
  description = "AWS region to launch servers."
  default     = "eu-north-1"
}

variable "key_name" {
  description = "Name of the SSH keypair to use in AWS."
  default     = "peti-test"
}

variable "private_key_path" {
  description = "Path to file containing private key"
  default     = "/home/nagypeti/.ssh/peti-test.pem"
}

variable "profile" {
  description = "AWS credentials profile you want to use"
  default     = "default"
}

variable "elkuser" {
  default = "admin"
}

variable "elkpass" {
  default = "admin"
}
