package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Pelicula;
import com.curso.service.PeliculasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class PeliculasController {

	@Autowired
	PeliculasService service;

	@ApiOperation(value = "Devuelve la lista de todas las peliculas en formato JSON")
	@GetMapping(value = "peliculas", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pelicula> listar() {
		return service.listar();
	}

	@ApiOperation(value = "Da de alta una pelicula recibida en el cuerpo de la peticion en formato JSON")
	@PostMapping(value = "pelicula", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaPelicula(@RequestBody Pelicula pelicula) {
		service.altaPelicula(pelicula);
	}

	@ApiOperation(value = "Actualiza una pelicula recibida en el cuerpo de la peticion en formato JSON")
	@PutMapping(value = "pelicula", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarPelicula(@RequestBody Pelicula pelicula) {
		service.actualizarPelicula(pelicula);
	}

	@ApiOperation(value = "Elimina una pelicula por su id pasado como parámetro")
	@DeleteMapping(value = "pelicula/{idpelicula}")
	public void eliminarPelicula(
			@ApiParam(value = "id de la película a eliminar") @PathVariable("idpelicula") int idPelicula) {
		service.eliminarPelicula(idPelicula);
	}

	@ApiOperation(value = "Devuelve el id de la pelicula indicada en la URL de la petición por su nombre")
	@GetMapping(value = "pelicula/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int buscarPelicula(
			@ApiParam(value = "nombre de la película buscada") @PathVariable("nombre") String nombre) {
		return service.buscarPelicula(nombre);
	}
	
	@ApiOperation(value = "Devuelve el nombre de la pelicula indicada en la URL de la petición por su id")
    @GetMapping(value = "peliculas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String buscarPelicula(
            @ApiParam(value = "id de la película buscada") @PathVariable("id") int idPelicula) {
        return service.buscarPelicula(idPelicula);
    }
}
