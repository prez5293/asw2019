FROM openjdk:8-jdk
ADD target/servizio_c-1.0.jar servizio_c-1.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "servizio_c-1.0.jar"]