package it.uniroma3.asw.servizio_c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.uniroma3.asw.servizio_c.service.AnimalService;

@RestController
@RequestMapping("/servizio-c")
public class ServizioCController {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping
	public String findAllAnimals() {
		return animalService.findAll();
	}
	
	@PostMapping
	public String saveAnimal(@RequestBody String string) {
		return animalService.save(string);
	}

}
