package com.example.model;

import org.springframework.data.annotation.Id;

public class Coche {
	@Id
	private String idCoche;
	
	private String modelo;

	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Coche [idCoche=" + idCoche + ", modelo=" + modelo + "]";
	}
	
	
}
