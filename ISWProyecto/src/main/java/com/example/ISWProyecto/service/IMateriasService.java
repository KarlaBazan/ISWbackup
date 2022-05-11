package com.example.ISWProyecto.service;
import java.util.List;

import com.example.ISWProyecto.model.Materias;
public interface IMateriasService {
	
	
	List<Materias> findAll(); 
	
	Materias findMateriaById(String idmateria);
	

}
