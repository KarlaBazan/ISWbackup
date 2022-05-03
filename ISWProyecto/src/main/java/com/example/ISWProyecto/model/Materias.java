package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MATERIAS")
@NamedQuery(name="Materias.findAll", query="SELECT a FROM Materias a")
public class Materias {
	
	@Id 
	private String idmateria;
	private String nombre;
	private String semestre;
	private String salon;
	public String getIdmateria() {
		return idmateria;
	}
	public void setIdmateria(String idmateria) {
		this.idmateria = idmateria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	


}
