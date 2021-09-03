package com.spring.crud.supervielle.service;

import java.util.List;

import com.spring.crud.supervielle.model.persona.Persona;

public interface PersonaService {

    List<?> findAll();

    Persona findById(int id);

    Persona save(Persona p);

	Persona update(int id, Persona p);

    void delete(int id);

}
