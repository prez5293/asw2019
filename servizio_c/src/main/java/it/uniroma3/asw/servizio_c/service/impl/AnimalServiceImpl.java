package it.uniroma3.asw.servizio_c.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import it.uniroma3.asw.servizio_c.entity.Animal;
import it.uniroma3.asw.servizio_c.exception.BadRequestException;
import it.uniroma3.asw.servizio_c.repository.AnimalRepository;
import it.uniroma3.asw.servizio_c.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Value("${instance.name:Sconosciuto}")
	private String instance;
	
	@Autowired
	AnimalRepository animalRepository;
	
	public String save(String string) {
		if(!string.matches(".*:\\ .*")) {
			throw new BadRequestException("La stringa in input non è corretta: deve essere del tipo \"[istanza]: [animale]\"");
		}
		Animal animal = new Animal();
		animal.setName(string.split(": ")[1]);
		animal.setCreatedBy(string.split(": ")[0]);;
		Animal animalSaved = animalRepository.save(animal);
		return animalSaved.getCreatedBy() + ": " + animalSaved.getName();
	}
	
	public String findAll() {
		List<Animal> animals = animalRepository.findAll();
		String string = "";
		if(animals != null && !animals.isEmpty()) {
			string = instance + ": [";
			for(Animal animal : animalRepository.findAll()) {
				string += animal.getCreatedBy() + ": " + animal.getName() + ", ";
			}
			string = string.substring(0, string.length() - 2);
			string += "]";
		}
		return string;
	}

}
