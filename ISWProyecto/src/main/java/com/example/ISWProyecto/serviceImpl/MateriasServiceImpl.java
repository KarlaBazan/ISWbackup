package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Materias;
import com.example.ISWProyecto.repository.AlumnoRepository;
import com.example.ISWProyecto.repository.MateriasRepository;
import com.example.ISWProyecto.service.IAlumnoService;
import com.example.ISWProyecto.service.IMateriasService;

@Service("MateriasService")
public class MateriasServiceImpl implements IMateriasService{
	
	@Autowired
	private MateriasRepository materiaRepository;

	@Override
	public Materias findMateriaById(String idmateria) {
		// TODO Auto-generated method stub
		return materiaRepository.findMateriaById(idmateria);
	}

	@Override
	public List<Materias> findAll() {
		// TODO Auto-generated method stub
		return materiaRepository.findAll();
	}

}
