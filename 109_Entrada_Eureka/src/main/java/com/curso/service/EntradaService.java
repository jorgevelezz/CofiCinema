package com.curso.service;

import java.util.List;

import com.curso.model.EntradaNombre;
import com.curso.model.Pelicula;

public interface EntradaService {

	List<EntradaNombre> peliculasEntradasDisponibles();
	void comprarEntrada(String nombre_pelicula, String hora_pelicula, int num_entradas);

}// interface