variable "aws_region" {
  description = "AWS region to launch servers."
  default     = "eu-north-1"
}

variable "profile" {
  description = "AWS credentials profile you want to use"
  default     = "default"
}

variable "key_name" {
  description = "Name of the SSH keypair to use in AWS."
  default     = "peti-test"
}

variable "website_bucket_name" {
  default = "website-test-np22"
}

variable "private_key_path" {
  description = "Path to file containing private key"
  default     = "/home/nagypeti/.ssh/peti-test.pem"
}

variable "aws_credentials_path" {
  default = "~/.aws/credentials"
}

variable "workdir_path" {
  default = "/home/nagypeti/GreenFox/01_greenfox_materials/projects/project_phase/week_03/terraform_Frontend_deployment_with_AWS_S3_bucket"
}
