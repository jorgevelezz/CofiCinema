package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.SalaDao;
import com.curso.model.Sala;

@Service
public class SalaServiceImpl implements SalaService {
	
	@Autowired
	SalaDao sd ;

	@Override
	public List<Sala> listar() {return sd.findAll();}

	@Override
	public void altaSala(Sala sala) {sd.save(sala);}


	@Override
	public int getButacas(int idSala) {
		
		Optional<Sala> sala = sd.findById(idSala);
		
		if(sala.isPresent()) {
			return sala.get().getButacas();
		}
		
		return 0;
	}

	@Override
	public void updateSala(int id, int butacas) {
		
		Optional<Sala> sala = sd.findById(id);
		
		if(sala.isPresent()) {
			sala.get().setButacas(butacas);
			sd.save(sala.get());
		}
		
	}

	@Override
	public void deleteSala(int id) {
		
		Optional<Sala> sala = sd.findById(id);
		
		if(sala.isPresent()) {
			sd.delete(sala.get());;
		}
		
	}

}
