#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#Multistage docker file
FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD  
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean install 
#FROM openjdk:11 
FROM openjdk:11-jdk-slim-buster
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/employeedemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 8080




