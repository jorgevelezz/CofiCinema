package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.PeliculasDao;
import com.curso.model.Pelicula;

@Service
public class PeliculasServiceImpl implements PeliculasService {

	@Autowired
	PeliculasDao dao;

	@Override
	public List<Pelicula> listar() {
		return dao.findAll();
	}

	@Override
	public void altaPelicula(Pelicula pelicula) {
		dao.save(pelicula);
	}

	@Override
	public void actualizarPelicula(Pelicula pelicula) {
		dao.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int idPelicula) {
		dao.deleteById(idPelicula);
	}

	@Override
	public int buscarPelicula(String nombre) {
		List<Pelicula> peliculas = dao.findAll();
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getNombre().equalsIgnoreCase(nombre)) {
				return pelicula.getIdpelicula();
			}
		}
		return 0;
	}
	
	@Override
    public String buscarPelicula(int idPelicula) {
        return dao.findById(idPelicula).orElse(null).getNombre();
    }

}
