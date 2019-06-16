#!/bin/bash

# itera la richiesta 100 volte 

for i in {1..5}; do 
	curl localhost:8080/api/asw2019/animals/
	echo "" ; 
done 
