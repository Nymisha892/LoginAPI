FROM openjdk:21
WORKDIR /app
COPY build/libs/LoginAPI-0.0.1-SNAPSHOT.jar LoginAPI.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "LoginAPI.jar"]
