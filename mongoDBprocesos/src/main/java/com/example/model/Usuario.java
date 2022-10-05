package com.example.model;


import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//esta anotación es específica de mongoDB y decimos que esta clase se mapea a esa coleccion Usuarios
@Document(value = "Usuarios")
public class Usuario {
	@Id
	private String id;
	
	private String nombre;
	
	private String edad;

	private Coche [] coches;
	

	public Usuario(String id, String nombre, String edad, Coche [] coches) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.coches=coches;
	}

	public Coche[] getCoches() {
		return coches;
	}

	public void setCoches(Coche[] coches) {
		this.coches = coches;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", coches=" + Arrays.toString(coches)
				+ "]";
	}

	
	
	
	
}