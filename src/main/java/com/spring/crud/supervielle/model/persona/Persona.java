package com.spring.crud.supervielle.model.persona;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Persona implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    private int edad;
    private Genero genero;
    
    private TipoDocumento tipoDocumento;
	private int numeroDocumento;
	@JsonManagedReference
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pais")
	private Pais pais;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona", cascade = { CascadeType.ALL})
	private List<InformacionContacto> informacionContacto;

    
}

