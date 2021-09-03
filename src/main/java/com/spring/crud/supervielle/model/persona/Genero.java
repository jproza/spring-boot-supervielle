package com.spring.crud.supervielle.model.persona;

public enum Genero {
	
	M(1,"MASCULINO"), F(2,"FEMENINO");

	private int id;
	private String tipo;
	
	private Genero(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	
	public static final Genero fromId(int id) {
		for (Genero t : Genero.values()) {
		    if(t.id == id) return t;
		}
		throw new IllegalArgumentException("Genero inexistente.");
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
