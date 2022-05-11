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

}
