package com.spring.crud.supervielle.model.persona;

public enum TipoDocumento {
	
	DNI(1,"DNI"), LCIVICA(2,"LCIVICA");

	private int id;
	private String tipo;
	
	private TipoDocumento(int id, String tipo) {
		this.id = id;
		this.tipo = tipo;
	}

	
	public static final TipoDocumento fromId(int id) {
		for (TipoDocumento t : TipoDocumento.values()) {
		    if(t.id == id) return t;
		}
		throw new IllegalArgumentException("Tipo documento inexistente.");
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
