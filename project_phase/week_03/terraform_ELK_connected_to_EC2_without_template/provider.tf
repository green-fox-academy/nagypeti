provider "aws" {
  profile                 = "${var.profile}"
  shared_credentials_file = "${var.aws_credentials_path}"
  region                  = "${var.aws_region}"
}
