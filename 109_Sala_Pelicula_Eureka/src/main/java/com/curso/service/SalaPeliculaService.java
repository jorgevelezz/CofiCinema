package com.curso.service;

import java.util.List;

import com.curso.model.SalaPelicula;

public interface SalaPeliculaService {
	
	void altaSalaPelicula(int idsala, int idpelicula, String hora);
	void eliminarSalaPelicula(int idsalapelicula);
	List<SalaPelicula> listarSalaPelicula();
	
	List<SalaPelicula> listarPeliculasConEntradasDisponibles();
	
	int idSalaPelicula(int idpelicula, String hora, int num_butacas);
	
}// interface