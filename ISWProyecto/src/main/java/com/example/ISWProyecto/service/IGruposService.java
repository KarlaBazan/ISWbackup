package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Grupos;


public interface IGruposService {
	
	List<Grupos> findAll(); 
	
	Grupos findGrupoById(String grupo);
}
