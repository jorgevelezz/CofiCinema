package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Pelicula;

public interface PeliculasDao extends JpaRepository<Pelicula, Integer> {

}
