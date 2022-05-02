package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ALUMNOS_HAS_CALIFICACIONES")
@NamedQuery(name="Alumnos_has_Calificaciones.findAll", query="SELECT a FROM Alumnos_has_Calificaciones a")
public class Alumnos_has_Calificaciones {
	
	@Id
	private String alumnos_boleta;
	private String calificaciones_materia;
	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}
	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}
	public String getCalificaciones_materia() {
		return calificaciones_materia;
	}
	public void setCalificaciones_materia(String calificaciones_materia) {
		this.calificaciones_materia = calificaciones_materia;
	}

}
	
