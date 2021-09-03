package com.spring.crud.supervielle.model.persona;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
public class Direccion implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "street_address")
    private String streetAddress;
    private String city;
    private String state;
    private String country;

    @Column(name = "postal_address")
    private String postalCode;
    
    @JsonBackReference
    @OneToOne(mappedBy="direccion", cascade=CascadeType.ALL)
    private InformacionContacto informacionContacto;

}