package com.spring.crud.supervielle.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.spring.crud.supervielle.model.persona.Direccion;
import com.spring.crud.supervielle.model.persona.Genero;
import com.spring.crud.supervielle.model.persona.InformacionContacto;
import com.spring.crud.supervielle.model.persona.Pais;
import com.spring.crud.supervielle.model.persona.Persona;
import com.spring.crud.supervielle.model.persona.Telefono;
import com.spring.crud.supervielle.model.persona.TipoDocumento;

public final class HelperUtil {

	public static Supplier<List<Persona>> personaSupplier; 
	
	
	public HelperUtil() {
		super();
	}
	
	

	static {

		personaSupplier = () -> {

			Telefono javiNumber = Telefono.builder().id(2).tipo("Mobile").numero("987654321")
					.build();
			
			Telefono OrianaNumber = Telefono.builder().id(3).tipo("Mobile").numero("123456789")
					.build();


					
			
			Persona javier = Persona.builder().id(2).nombre("Javier").apellido("Prozapas").edad(39).tipoDocumento(TipoDocumento.DNI).numeroDocumento(29118988).genero(Genero.M).pais(Pais.builder()
					.id(1).nombre("Argentina").build())
					.build();		


			Persona oriana = Persona.builder().id(3).nombre("Oriana").apellido("Prozapas").edad(7).tipoDocumento(TipoDocumento.DNI).numeroDocumento(68999333).genero(Genero.F).pais(Pais.builder()
					.id(2).nombre("Argentina").build())
					.build();		
			
			InformacionContacto contacto = InformacionContacto.builder().id(2)
					.direccion(Direccion.builder().city("Lanus").postalCode("1824").streetAddress("noya 298").build())
					.telefonos(Arrays.asList(javiNumber)).persona(javier).build();
					
					InformacionContacto contactoOri = InformacionContacto.builder().id(3)
							.direccion(Direccion.builder().city("Arrecifes").postalCode("2740").streetAddress("calle 1").build())
							.telefonos(Arrays.asList(OrianaNumber)).persona(oriana).build();
							
			
					OrianaNumber.setInformacionContacto(contactoOri);
					javiNumber.setInformacionContacto(contacto);
					
					oriana.setInformacionContacto(Arrays.asList(contactoOri));
					javier.setInformacionContacto(Arrays.asList(contacto));

			return Arrays.asList(javier,oriana);
		};

	}

}
