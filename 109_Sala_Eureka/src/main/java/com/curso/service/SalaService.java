package com.curso.service;

import java.util.List;

import com.curso.model.Sala;

public interface SalaService {
	
	List<Sala> listar();
	
	void altaSala(Sala sala);
	
	void updateSala(int id, int butacas);
	
	void deleteSala(int id);
	
	int getButacas(int idSala);
	

}
