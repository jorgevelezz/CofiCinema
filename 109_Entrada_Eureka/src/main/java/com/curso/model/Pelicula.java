package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Pelicula {
	
	private int idpelicula;
	private int numbutacas;
	private String hora;
	
	
	//Constructores
	public Pelicula() {
		
	}

	public Pelicula(int idpelicula, int numbutacas, String hora) {

		this.idpelicula = idpelicula;
		this.numbutacas = numbutacas;
		this.hora = hora;
	}

	//Getters&Setters

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public int getNumbutacas() {
		return numbutacas;
	}

	public void setNumbutacas(int numbutacas) {
		this.numbutacas = numbutacas;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
}//class