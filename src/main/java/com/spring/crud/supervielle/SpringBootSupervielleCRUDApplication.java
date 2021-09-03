package com.spring.crud.supervielle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.spring.crud.supervielle.model.persona.Persona;
import com.spring.crud.supervielle.repository.PersonaRepository;
import com.spring.crud.supervielle.utils.HelperUtil;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@SpringBootApplication
@EnableJpaRepositories
public class SpringBootSupervielleCRUDApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSupervielleCRUDApplication.class, args);
	}


	@Autowired
	private PersonaRepository personaRepository;

	@Bean
	CommandLineRunner runner() {
		return args -> {


			List<Persona> personas = personaRepository.findAll();
			if (personas.isEmpty()) {
				log.info("******* Inserting Personas to DB *******");
				personaRepository.saveAll(new HelperUtil().personaSupplier.get());
			} else {
				log.info("******* Personas stored in DB Size :: {}", personas.size());
				log.info("******* Personas stored in DB :: {}", personas);
			}
		};
	}

}
