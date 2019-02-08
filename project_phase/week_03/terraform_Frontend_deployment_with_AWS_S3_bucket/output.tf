output "url" {
  value = "${aws_s3_bucket.website_bucket.bucket}.s3-website.${var.aws_region}.amazonaws.com"
}
