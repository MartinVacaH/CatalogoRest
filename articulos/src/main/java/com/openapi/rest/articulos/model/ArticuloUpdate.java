package com.openapi.rest.articulos.model;

import jakarta.validation.constraints.*;

public class ArticuloUpdate {
    @Size(max = 200)
    private String descripcion;

    @Size(max = 10)
    private String modelo;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
