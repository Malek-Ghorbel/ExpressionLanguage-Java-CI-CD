# stage 1 : build
FROM maven:3.8.4-openjdk-17-slim AS build-stage

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package

#stage 2
FROM openjdk:17

COPY --from=build-stage /app/target/parser-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "app.jar"]