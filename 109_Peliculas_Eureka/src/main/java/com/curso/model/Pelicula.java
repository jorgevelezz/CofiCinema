package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpelicula;
	private String nombre;
	private int anio;
	private int duracion;

	// Constructores
	public Pelicula() {
		super();
	}

	public Pelicula(int idpelicula, String nombre, int anio, int duracion) {
		super();
		this.idpelicula = idpelicula;
		this.nombre = nombre;
		this.anio = anio;
		this.duracion = duracion;
	}

	// Getters y setters
	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
