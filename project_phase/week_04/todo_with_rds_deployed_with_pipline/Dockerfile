FROM openjdk:8-jdk-alpine

VOLUME /tmp
ARG JAR_FILE=build/libs/todo_with_rds_deployed_with_pipeline-awesome-version.jar
COPY ${JAR_FILE} todo-app.jar
ENTRYPOINT ["java","-jar","/todo-app.jar"]
