package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salapelicula")
public class SalaPelicula {
	
	//Atributos
	@Id
	private int idsalapelicula;
	private int idsala;
	private int idpelicula;
	private int numbutacas;
	private String hora;
	
	//Constructores
	public SalaPelicula() {
		
	}

	public SalaPelicula(int idsalapelicula, int idsala, int idpelicula, int numbutacas, String hora) {
		this.idsalapelicula = idsalapelicula;
		this.idsala = idsala;
		this.idpelicula = idpelicula;
		this.numbutacas = numbutacas;
		this.hora = hora;
	}

	//Getters&Setters
	public int getIdsalapelicula() {
		return idsalapelicula;
	}

	public void setIdsalapelicula(int idsalapelicula) {
		this.idsalapelicula = idsalapelicula;
	}
	
	public int getIdsala() {
		return idsala;
	}

	public void setIdsala(int idsala) {
		this.idsala = idsala;
	}

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