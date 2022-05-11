package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.repository.Alumnos_has_gruposRepository;
import com.example.ISWProyecto.service.IAlumnos_has_grupos;

@Service("Alumnos_has_gruposService")
public class Alumnos_has_gruposServiceImpl implements IAlumnos_has_grupos {

	@Autowired
	Alumnos_has_gruposRepository alumnoshgRepository;
	

	@Override
	public Alumnos_has_grupos findAlumnoHGById(String alumnos_boleta) {
		
		return alumnoshgRepository.findAlumnoHGById(alumnos_boleta);
	}
	@Override
	public List<Alumnos_has_grupos> findAll() {
		// TODO Auto-generated method stub
		return alumnoshgRepository.findAll();
	}

}
