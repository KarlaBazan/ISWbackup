package com.example.ISWProyecto.service;
import java.util.List;

import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
public interface IAlumnos_has_Calificaciones {
	
	List<Alumnos_has_Calificaciones> findAll();
	
	Alumnos_has_Calificaciones findAlumnoHCById(String alumnos_boleta);

}
