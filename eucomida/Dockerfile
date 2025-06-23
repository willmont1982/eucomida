FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/eucomida.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
