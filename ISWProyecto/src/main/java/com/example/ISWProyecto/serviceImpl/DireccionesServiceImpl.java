package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Direcciones;
import com.example.ISWProyecto.repository.DireccionesRepository;
import com.example.ISWProyecto.service.IDireccionesService;

@Service("DireccionesService")
public class DireccionesServiceImpl implements IDireccionesService{
	
	@Autowired 
	DireccionesRepository direccionesRepository;
	

	@Override
	public Direcciones findDireccion(Long iddirecciones) {
		return direccionesRepository.findDireccion(iddirecciones);
	}

	@Override
	public List<Direcciones> findAll() {
		return direccionesRepository.findAll();
	}

	@Override
	public void update(Direcciones dr) {
		direccionesRepository.save(dr);
		
	}

	@Override
	public void add(Direcciones dr) {
		direccionesRepository.save(dr);
		
	}

	@Override
	public Direcciones agregarDireccion(Direcciones dr) {
		return direccionesRepository.save(dr);
	}

	@Override
	public Direcciones actualizarDireccion(Direcciones dr) {
		return direccionesRepository.save(dr);
	}

}
