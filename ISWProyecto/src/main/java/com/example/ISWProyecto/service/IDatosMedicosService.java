package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.DatosMedicos;

public interface IDatosMedicosService {
	
	DatosMedicos findDatos(Double num_seg_social);
	
	List<DatosMedicos> findAll();
	
	void update(DatosMedicos dm); 
	
	void add(DatosMedicos dm);
	
	DatosMedicos agregarDatosMedicos(DatosMedicos dm);
	
	DatosMedicos actualizarDatosMedicos(DatosMedicos dm);

}
