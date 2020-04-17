FROM maven:3.6-jdk-8 as maven
COPY src /app/src
COPY pom.xml /app/pom.xml
WORKDIR /app
RUN mvn package

FROM openjdk:8-jre-alpine
COPY --from=maven /app/target/*.jar /app/app.jar
WORKDIR /app
ENTRYPOINT java -jar app.jar
EXPOSE 8080
