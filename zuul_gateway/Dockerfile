FROM openjdk:8-jdk 

ADD target/zuul_gateway-1.0.jar zuul_gateway-1.0.jar

ENTRYPOINT ["java", "-Xmx128m", "-Xms128m", "-jar", "zuul_gateway-1.0.jar"]

