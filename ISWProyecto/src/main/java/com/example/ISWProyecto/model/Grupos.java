package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="GRUPOS")
@NamedQuery(name="Grupos.findAll", query="SELECT a FROM Grupos a")
public class Grupos {

	@Id
	private String grupo; 
	
	private String turno; 
	
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	
	
}
