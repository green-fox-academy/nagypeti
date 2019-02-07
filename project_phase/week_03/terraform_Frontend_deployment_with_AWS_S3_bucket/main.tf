resource "aws_s3_bucket" "deploy_frontend_website_bucket" {
  bucket = "${var.website_bucket_name}"
  acl    = "public-read"
  policy = "${file("${var.workdir_path}/policy.json")}"

  tags {
    Name        = "Website"
    Environment = "Dev"
  }

  cors_rule {
    allowed_headers = ["*"]
    allowed_methods = ["PUT", "POST"]
    allowed_origins = ["*"]
    expose_headers  = ["ETag"]
    max_age_seconds = 3000
  }

  website {
    index_document = "index.html"
  }
}
