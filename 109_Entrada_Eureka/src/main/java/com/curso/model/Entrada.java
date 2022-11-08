package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entrada")
public class Entrada {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identrada;
	private int idsalapelicula;
	private int numentradas;
	

	public Entrada() {
		
	}

	public Entrada(int identrada, int idsalapelicula, int numentradas) {
		this.identrada = identrada;
		this.idsalapelicula = idsalapelicula;
		this.numentradas = numentradas;
	}

	//Getters&Setters
	public int getIdentrada() {
		return identrada;
	}

	public void setIdentrada(int identrada) {
		this.identrada = identrada;
	}

	public int getIdsala_pelicula() {
		return idsalapelicula;
	}

	public void setIdsala_pelicula(int idsala_pelicula) {
		this.idsalapelicula = idsala_pelicula;
	}

	public int getNumentradas() {
		return numentradas;
	}

	public void setNumentradas(int numentradas) {
		this.numentradas = numentradas;
	}

}//class