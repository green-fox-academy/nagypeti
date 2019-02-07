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

variable "workdir_path" {
  default = "/home/nagypeti/GreenFox/01_greenfox_materials/projects/project_phase/week_03/terraform_ELK_connected_to_EC2_with_template"
}
