FROM openjdk:8-jdk 

ADD target/eureka_server-1.0.jar eureka_server-1.0.jar

EXPOSE 8761

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "eureka_server-1.0.jar"]

