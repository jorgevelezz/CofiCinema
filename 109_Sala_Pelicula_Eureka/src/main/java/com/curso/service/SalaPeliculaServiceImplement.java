package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.SalaPeliculaDao;
import com.curso.model.SalaPelicula;

@Service
public class SalaPeliculaServiceImplement implements SalaPeliculaService {

	@Autowired
	SalaPeliculaDao dao;
	@Autowired
	RestTemplate template;

	String url_sala = "http://servicio-salas/";
	String url_peliculas = "http://servicio-peliculas/";

	@Override
	public void altaSalaPelicula(int idsala, int idpelicula, String hora) {
		SalaPelicula sp = new SalaPelicula();
		sp.setIdsala(idsala);
		sp.setIdpelicula(idpelicula);
		sp.setHora(hora);
		dao.save(sp);
	}// eliminarSalaPelicula

	@Override
	public void eliminarSalaPelicula(int idsalapelicula) {
		dao.delete(dao.findById(idsalapelicula).get());
	}// eliminarSalaPelicula

	@Override
	public List<SalaPelicula> listarSalaPelicula() {
		return dao.findAll();
	}// listarSalaPelicula

	@Override
	public List<SalaPelicula> listarPeliculasConEntradasDisponibles() {
		return dao.listarPeliculasConEntradasDisponibles();
	}// listarPeliculasConEntradasDisponibles

	@Override
	public int idSalaPelicula(int idpelicula, String hora, int num_entradas) {
		int idsalapelicula = dao.idSalaPelicula(idpelicula, hora);
		// Actualizamos las butacas disponibles de la sala
		dao.actualizarButacasDisponibles(idpelicula, hora, num_entradas);
		return idsalapelicula;
	}// idSalaPelicula

}// class