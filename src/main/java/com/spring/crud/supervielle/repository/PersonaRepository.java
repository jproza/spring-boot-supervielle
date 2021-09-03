package com.spring.crud.supervielle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.crud.supervielle.model.persona.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
