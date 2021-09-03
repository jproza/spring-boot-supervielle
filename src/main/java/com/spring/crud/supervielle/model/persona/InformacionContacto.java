package com.spring.crud.supervielle.model.persona;


import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
public class InformacionContacto implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    
    @JsonManagedReference
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="direccion")
    private Direccion direccion;

  
    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "informacionContacto", cascade = { CascadeType.ALL})
    private List<Telefono> telefonos;

    @JsonBackReference
    @ManyToOne(cascade= { CascadeType.ALL})
    @JoinColumn(name="persona")
    private Persona persona;

}