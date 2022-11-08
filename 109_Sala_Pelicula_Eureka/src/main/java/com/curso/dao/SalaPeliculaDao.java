package com.curso.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.SalaPelicula;

public interface SalaPeliculaDao extends JpaRepository<SalaPelicula, Integer> {

	@Query(value = "SELECT * FROM salapelicula WHERE numbutacas>0", nativeQuery = true)
	List<SalaPelicula> listarPeliculasConEntradasDisponibles();

	@Query(value = "SELECT idsalapelicula FROM salapelicula WHERE idpelicula =?1 AND hora=?2", nativeQuery = true)
	public int idSalaPelicula(int idpelicula, String hora);

	@Modifying
	@Transactional
	@Query(value = "UPDATE salapelicula SET numbutacas=numbutacas-?3 WHERE idpelicula=?1 AND hora =?2" , nativeQuery=true)
	void actualizarButacasDisponibles(int idpelicula, String hora, int num_butacas);

}// interface