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
	private String calificaciones_materia_idmateria;
	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}
	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}
	public String getCalificaciones_materia_idmateria() {
		return calificaciones_materia_idmateria;
	}
	public void setCalificaciones_materia_idmateria(String calificaciones_materia_idmateria) {
		this.calificaciones_materia_idmateria = calificaciones_materia_idmateria;
	}
	

}
	
