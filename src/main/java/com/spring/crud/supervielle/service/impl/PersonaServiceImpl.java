package com.spring.crud.supervielle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import com.spring.crud.supervielle.model.persona.Persona;
import com.spring.crud.supervielle.repository.PersonaRepository;
import com.spring.crud.supervielle.service.PersonaService;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona findById(int id) {
        return repository.findById(id).orElseThrow(() -> new NotFoundException("** Persona not found for id :: " + id));
    }

    @Override
    public Persona save(Persona p) {
        return repository.save(p);
    }

    @Override
    public Persona update(int id, Persona p) {
    	repository.findById(id).orElseThrow(() -> new NotFoundException("** Persona not found for id :: " + id));
        
    	p.setId(id);
    	return repository.save(p);
    }

    @Override
    public void delete(int id) {
        repository.findById(id).ifPresent(per -> repository.delete(per));
    }
}
