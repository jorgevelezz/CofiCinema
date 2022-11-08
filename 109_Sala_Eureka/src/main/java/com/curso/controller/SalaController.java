package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Sala;
import com.curso.service.SalaService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SalaController {
	
	@Autowired
	SalaService ss;
	
	@ApiOperation(value = "Devuelve el numero de butacas de la sala pasada por parametro")
	@GetMapping(value="sala/{idSala}", produces= MediaType.APPLICATION_JSON_VALUE)
	int getButacas(@PathVariable("idSala")int idSala) {return ss.getButacas(idSala);}
	
	@PostMapping(value="sala",consumes=MediaType.APPLICATION_JSON_VALUE)
	void altaSala(@RequestBody Sala sala) {ss.altaSala(sala);}
	
	@DeleteMapping(value="sala")
	void deleteSala(@PathVariable int id) {ss.deleteSala(id);}
	
	@PutMapping(value="sala")
	void updateSala(@PathVariable("id") int id, @PathVariable("butacas") int butacas) {ss.updateSala(id, butacas);}
	
}
