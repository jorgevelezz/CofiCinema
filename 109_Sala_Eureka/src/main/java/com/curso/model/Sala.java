package com.curso.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sala")
public class Sala {
	
	@Id
	private int idsala;
	
	private int butacas;
	

	public Sala(int idsala, int butacas) {
		super();
		this.idsala = idsala;
		this.butacas = butacas;
	}

	public Sala() {
		super();
	}

	public int getIdsala() {
		return idsala;
	}

	public void setIdSala(int idsala) {
		this.idsala = idsala;
	}

	public int getButacas() {
		return butacas;
	}

	public void setButacas(int butacas) {
		this.butacas = butacas;
	}

}
