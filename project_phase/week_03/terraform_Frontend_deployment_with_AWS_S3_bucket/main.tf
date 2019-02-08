# resource "aws_s3_bucket" "logs" {
#   bucket = "${var.website_bucket_name}-site-logs"
#   acl    = "log-delivery-write-read"
# }

data "template_file" "s3_public_policy" {
  template = "${file("${var.workdir_path}/policy.json")}"

  vars {
    bucket_name = "${var.website_bucket_name}"
  }
}

resource "aws_s3_bucket" "website_bucket" {
  bucket = "${var.website_bucket_name}"
  acl    = "public-read"
  policy = "${data.template_file.s3_public_policy.rendered}"

  tags {
    name        = "${var.website_bucket_name}"
    Environment = "Dev"
  }

  # logging {
  #   target_bucket = "${var.website_bucket_name}"
  #   target_prefix = "log-${var.website_bucket_name}"
  # }

  website {
    index_document = "index.html"
  }
}

resource "aws_s3_bucket_object" "index" {
  bucket       = "${aws_s3_bucket.website_bucket.bucket}"
  key          = "index.html"
  source       = "${var.workdir_path}/index.html"
  content_type = "text/html"
  etag         = "${md5(file("${var.workdir_path}/index.html"))}"
}
