package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.DatosMedicos;
import com.example.ISWProyecto.repository.DatosMedicosRepository;
import com.example.ISWProyecto.service.IDatosMedicosService;

@Service("DatosMedicosService")
public class DatosMedicosServiceImpl implements IDatosMedicosService{
	
	@Autowired 
	DatosMedicosRepository datosMedicosRepository;
	

	@Override
	public DatosMedicos findDatos(Double num_seg_social) {
		return datosMedicosRepository.findDatos(num_seg_social);
	}

	@Override
	public List<DatosMedicos> findAll() {
		return datosMedicosRepository.findAll();
	}

	@Override
	public void update(DatosMedicos dm) {
		datosMedicosRepository.save(dm);
		
	}

	@Override
	public void add(DatosMedicos dm) {
		datosMedicosRepository.save(dm);
		
	}

	@Override
	public DatosMedicos agregarDatosMedicos(DatosMedicos dm) {
		return datosMedicosRepository.save(dm);
	}

	@Override
	public DatosMedicos actualizarDatosMedicos(DatosMedicos dm) {
		return datosMedicosRepository.save(dm);
	}

}
