package com.curso.model;


public class EntradaNombre {

	private String nombre;
	private int num_butacas;
	private String hora;
	
	public EntradaNombre(String nombre, int num_butacas, String hora) {
		super();
		this.nombre = nombre;
		this.num_butacas = num_butacas;
		this.hora = hora;
	}

	public EntradaNombre() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNum_butacas() {
		return num_butacas;
	}

	public void setNum_butacas(int num_butacas) {
		this.num_butacas = num_butacas;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
	
	
	
}
