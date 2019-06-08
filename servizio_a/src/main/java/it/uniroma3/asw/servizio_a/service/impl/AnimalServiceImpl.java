package it.uniroma3.asw.servizio_a.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.uniroma3.asw.servizio_a.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService{
	
	@Value("${instance.name:Sconosciuto}")
	private String instance;

	@Value("${animal.list}")
	private String[] animals;
	
	public String getAnimal() {
        int randomNumber = new Random().nextInt(animals.length);
        return instance + ": " + animals[randomNumber];
	}

}
