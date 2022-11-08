package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.SalaPelicula;
import com.curso.service.SalaPeliculaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class SalaPeliculaController {

	@Autowired
	SalaPeliculaService service;

	@ApiOperation(value = "Alta de una sala pelicula")
	@PutMapping(value = "salapelicula/{idsala}/{idpelicula}/{hora}")
	public void altaSalaPelicula(@ApiParam(value = "id de la sala") @PathVariable(name = "idsala") int idsala,
			@ApiParam(value = "id de la pelicula") @PathVariable(name = "idpelicula") int idpelicula,
			@ApiParam(value = "hora de la pelicula") @PathVariable(name = "hora") String hora) {
		service.altaSalaPelicula(idsala, idpelicula, hora);
	}// altaSalaPelicula

	@ApiOperation(value = "Elimina una sala pelicula")
	@DeleteMapping(value = "salapelicula/{id}")
	public void eliminarSalaPelicula(
			@ApiParam(value = "id de la sala pelicula") @PathVariable(name = "id") int idsalapelicula) {
		service.eliminarSalaPelicula(idsalapelicula);
	}// eliminarSalaPelicula

	@ApiOperation(value = "Listado de todas las salas peliculas")
	@GetMapping(value = "salapeliculas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SalaPelicula> listarSalaPelicula() {
		return service.listarSalaPelicula();
	}// listarSalaPelicula

	@ApiOperation(value = "Listado de peliculas disponibles para comprar entradas")
	@GetMapping(value = "salapeliculas/dispo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SalaPelicula> listarPeliculasConEntradasDisponibles() {
		return service.listarPeliculasConEntradasDisponibles();
	}// listarPeliculasConEntradasDisponibles

	@ApiOperation(value = "Devuelve el id de salapelicula para añadir el idsalapelicula en la entrada a comprar y actualiza el numero de butacas disponibles en la sala")
	@GetMapping(value = "salapelicula/{idpelicula}/{hora}/{num_butacas}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int idSalaPelicula(@ApiParam(value = "id de la pelicula") @PathVariable(name = "idpelicula") int idpelicula,
			@ApiParam(value = "hora de la pelicula") @PathVariable(name = "hora") String hora,
			@ApiParam(value = "numero de butacas") @PathVariable(name = "num_butacas") int num_butacas) {
		return service.idSalaPelicula(idpelicula, hora, num_butacas);
	}// idSalaPelicula

}// class