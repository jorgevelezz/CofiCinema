package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.EntradaDao;
import com.curso.model.Entrada;
import com.curso.model.EntradaNombre;
import com.curso.model.Pelicula;

@Service
public class EntradaServiceImplement implements EntradaService {

	@Autowired
	RestTemplate template;
	@Autowired
	EntradaDao dao;

	String url_peliculas = "http://servicio-peliculas/";
	String url_sala_pelicula = "http://servicio-sala-pelicula/";

	@Override
	public List<EntradaNombre> peliculasEntradasDisponibles() {
		
		List<Pelicula> peliculasDisponibles = Arrays.asList(template.getForObject(url_sala_pelicula + "salapeliculas/dispo", Pelicula[].class));

		List<EntradaNombre> entradas = new ArrayList<EntradaNombre>();
		
		for (Pelicula sp : peliculasDisponibles) {
			entradas.add(new EntradaNombre(template.getForObject(url_peliculas.concat("/peliculas/"+sp.getIdpelicula()), String.class),sp.getNumbutacas(),sp.getHora()));
			
		}
		
		
		return entradas;
	}// peliculasEntradasDisponibles

	@Override
	public void comprarEntrada(String nombre_pelicula, String hora_pelicula, int num_entradas) {
		Entrada entrada = new Entrada();
		int id_pelicula = template.getForObject(url_peliculas+"pelicula/" + nombre_pelicula, Integer.class);
		int id_sala_pelicula = template.getForObject(url_sala_pelicula + "salapelicula/" + id_pelicula + "/" + hora_pelicula + "/" + num_entradas, Integer.class);
		
		entrada.setIdsala_pelicula(id_sala_pelicula);
		entrada.setNumentradas(num_entradas);
		dao.save(entrada);
	}// comprarEntrada

}// class
