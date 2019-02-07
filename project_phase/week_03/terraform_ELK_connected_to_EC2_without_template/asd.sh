sudo docker run -d \
--name=filebeat \
--user=root \
--volume="/home/ec2-user/filebeat/filebeat.docker.yml:/usr/share/filebeat/filebeat.yml:ro" \
--volume="/var/lib/docker/containers:/var/lib/docker/containers:ro" \
--volume="/var/run/docker.sock:/var/run/docker.sock:ro" \
store/elastic/filebeat:6.6.0 filebeat \
-e -strict.perms=false \
-E output.elasticsearch.hosts=[${aws_instance.elk_stack.public_ip}:9200] \
setup -E setup.kibana.host=${aws_instance.elk_stack.public_ip}:5601 \
-E output.elasticsearch.hosts=[${aws_instance.elk_stack.public_ip}:9200]
