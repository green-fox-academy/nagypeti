BUILD_ID=$1

ENV_NAME="Petitodoapprdspiplinetest-env"
S3_BUCKET="peti-todo-app"
APP_NAME='PetiTodoAppRDSPiplineTest'

aws s3 cp ./Dockerrun.aws.json \
 s3://$S3_BUCKET/$BUILD_ID/Dockerrun.aws.json

aws elasticbeanstalk create-application-version \
 --application-name "$APP_NAME" \
 --version-label todo-$BUILD_ID \
 --source-bundle S3Bucket="$S3_BUCKET",S3Key="$BUILD_ID/Dockerrun.aws.json" \
 --auto-create-application

aws elasticbeanstalk update-environment \
 --application-name "$APP_NAME" \
 --environment-name $ENV_NAME \
 --version-label todo-$BUILD_ID
