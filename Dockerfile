FROM openjdk:21
EXPOSE 8080
COPY build/libs/REST-0.0.1-SNAPSHOT-plain.jar app.jar
CMD ["java", "-jar", "app.jar"]