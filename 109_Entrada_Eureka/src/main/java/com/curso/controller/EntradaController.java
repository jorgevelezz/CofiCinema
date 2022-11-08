package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.curso.model.EntradaNombre;
import com.curso.service.EntradaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Controller
public class EntradaController {

	@Autowired
	EntradaService service;

	@ApiOperation(value = "Devuelve un listado en formato JSON con las peliculas para las que hay entradas disponibles")
	@GetMapping(value = "entradas", produces = MediaType.APPLICATION_JSON_VALUE)
	public String peliculasEntradasDisponibles(ModelMap mp) {
		
		//return service.peliculasEntradasDisponibles();
		
		//ThymeLeaf
		mp.put("entradas", service.peliculasEntradasDisponibles());
		return "/list/listaEntradas";
		
		
	}// peliculasEntradasDisponibles

	@ApiOperation(value = "Compra de entradas para una pelicula a la hora elegida")
	@PostMapping(value = "entrada")
	public String comprarEntrada(EntradaNombre entrada,ModelMap mp) {
		
		service.comprarEntrada(entrada.getNombre(), entrada.getHora(), entrada.getNum_butacas());

		return peliculasEntradasDisponibles(mp);
		
	}// comprarEntrada

	
	@GetMapping(value = "comprar")
	public String comprar(ModelMap mp) {

		mp.put("entrada", new EntradaNombre());
		mp.put("peliculas",service.peliculasEntradasDisponibles());
		return "/create/createEntrada";
		
	}
	
	
	
}// class