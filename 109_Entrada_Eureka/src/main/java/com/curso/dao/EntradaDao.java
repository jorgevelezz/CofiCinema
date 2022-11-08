package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Entrada;

public interface EntradaDao extends JpaRepository<Entrada, Integer> {

}//interface