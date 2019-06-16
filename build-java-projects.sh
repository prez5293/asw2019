#!/bin/bash

echo Building Java projects  

cd eureka_server
./mvnw -DskipTests clean install
cd ../servizio_a
./mvnw -DskipTests clean install
cd ../servizio_c
./mvnw -DskipTests clean install
cd ../zuul_gateway
./mvnw -DskipTests clean install

echo Build finished
