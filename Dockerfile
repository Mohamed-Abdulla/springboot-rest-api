FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar spring-rest-api.jar
ENTRYPOINT ["java","-jar","/spring-rest-api.jar"]
EXPOSE 8080