package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.repository.AlumnoRepository;
import com.example.ISWProyecto.service.IAlumnoService;

public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public Alumno findAlumno(String boleta, String password) {
		return alumnoRepository.findAlumno(boleta, password);
	}

	@Override
	public List<Alumno> findAll() {
		return alumnoRepository.findAll();
	}

}
