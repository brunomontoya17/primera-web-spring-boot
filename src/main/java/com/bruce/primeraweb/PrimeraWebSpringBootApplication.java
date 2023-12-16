package com.bruce.primeraweb;

import com.bruce.primeraweb.entities.Persona;
import com.bruce.primeraweb.repositories.PersonaRepository;
import com.bruce.primeraweb.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(PrimeraWebSpringBootApplication.class, args);
	}
	/*
	@Override
	public void run(String... args) throws Exception {
		Persona person1 = new Persona();
		person1.setId(5L);
		person1.setNombre("Bruce");
		person1.setEdad(36);
		personaService.crearPersona(person1);
		personaService.crearPersona(new Persona(6L,"Fernanda",20));
		personaService.crearPersona(new Persona(7L,"Lucia",23));
		personaService.crearPersona(new Persona(8L,"Juan",31));

		System.out.println("El numero de personas es de: " + personaService.contarPersonas());

		List<Persona> persons = personaService.obtenerTodas();
		persons.forEach( p -> System.out.println("El nombre de la persona es: " + p.getNombre()));
	}*/
}
