package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.Direcciones;

public interface IDireccionesService {
	
	Direcciones findDireccion(Long iddireccione);
	
	List<Direcciones> findAll();
	
	void update(Direcciones dr); 
	
	void add(Direcciones dr);
	
	Direcciones agregarDireccion(Direcciones dr);
	
	Direcciones actualizarDireccion(Direcciones dr);
	

}
