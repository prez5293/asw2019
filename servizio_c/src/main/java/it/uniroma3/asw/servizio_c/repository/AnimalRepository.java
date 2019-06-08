package it.uniroma3.asw.servizio_c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.uniroma3.asw.servizio_c.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}
