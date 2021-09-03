package com.spring.crud.supervielle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.supervielle.model.persona.Persona;
import com.spring.crud.supervielle.service.PersonaService;

@RestController
@RequestMapping(value  = "/personas", consumes = MediaType.APPLICATION_JSON_VALUE,
produces = MediaType.APPLICATION_JSON_VALUE)
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping
    public ResponseEntity<List<?>> findAll() {
        List<?> list = service.findAll();
        
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable int id) {
        Persona p = service.findById(id);
        return ResponseEntity.ok().body(p);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Persona persona) {
        Persona savedP = service.save(persona);
        return ResponseEntity.ok().body(savedP);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody Persona persona) {
        Persona updatedP = service.update(id, persona);
        return ResponseEntity.ok().body(updatedP);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.ok().body("Eliminado correctamente!");
    }
}

