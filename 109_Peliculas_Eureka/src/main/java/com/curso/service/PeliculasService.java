package com.curso.service;

import java.util.List;

import com.curso.model.Pelicula;

public interface PeliculasService {

	List<Pelicula> listar();

	void altaPelicula(Pelicula pelicula);

	void actualizarPelicula(Pelicula pelicula);

	void eliminarPelicula(int idPelicula);

	int buscarPelicula(String nombre);

	String buscarPelicula(int idPelicula);

}
