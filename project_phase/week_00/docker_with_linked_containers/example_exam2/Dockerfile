FROM openjdk:8-jdk-alpine

ENV MYSQL_URL_DB=jdbc:mysql://mysql-docker:3306/attractions_db
ENV MYSQL_USER=attractionsuser
ENV MYSQL_PASS=psswd

VOLUME /tmp
ARG JAR_FILE=build/libs/info-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} info.jar
ENTRYPOINT ["java","-jar","/info.jar"]