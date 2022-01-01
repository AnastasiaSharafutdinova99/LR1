FROM maven:3.5.2-jdk-8-alpine

COPY /target/simpleapi-0.0.1-SNAPSHOT.jar simpleapi.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/simpleapi.jar"]