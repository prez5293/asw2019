package it.uniroma3.asw.servizio_a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.asw.servizio_a.feign.AnimalClient;
import it.uniroma3.asw.servizio_a.service.AnimalService;

@RestController
@RequestMapping("/animals")
public class ServizioAController {
	
	@Autowired
	private AnimalClient animalClient;
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping
	public String findAllAnimals() {
		return animalClient.findAllAnimals();
	}
	
	@PostMapping
	public String saveAnimal() {
		return animalClient.saveAnimal(animalService.getAnimal());
	}

}
