package com.spring.crud.supervielle.model.persona;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Telefono implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String tipo;
    private String numero;
    
    @JsonBackReference
    @OneToOne(cascade= { CascadeType.ALL})
    @JoinColumn(name="informacionContacto")
    private InformacionContacto informacionContacto;

}