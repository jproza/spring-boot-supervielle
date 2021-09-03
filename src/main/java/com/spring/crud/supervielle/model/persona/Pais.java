package com.spring.crud.supervielle.model.persona;

import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class Pais implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String nombre;
    // Constructor, Getter and Setter
    
    @JsonBackReference
    @OneToOne(mappedBy="pais", cascade=CascadeType.ALL)
    private Persona persona;
}