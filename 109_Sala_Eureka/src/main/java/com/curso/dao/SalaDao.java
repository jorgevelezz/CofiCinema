package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Sala;

public interface SalaDao extends JpaRepository<Sala, Integer> {
	
	@Query(value="select idsala from sala where idpelicula=?1",nativeQuery=true)
	int findByIdPelicula(int id);

}
