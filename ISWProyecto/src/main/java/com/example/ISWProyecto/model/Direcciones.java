package com.example.ISWProyecto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name="DIRECCIONES")
@NamedQuery(name="Direcciones.findAll", query="SELECT a FROM Direcciones a")
public class Direcciones {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long iddireccion; 
	
	private String calle; 
	
	private String numext; 
	
	private String numint;
	
	private Integer cp; 
	
	private String telcasa; 
	
	private String telmovil; 
	
	private String teltrabajo; 
	
	private Integer ext; 
	
	private String estado; 
	
	private String alcaldia; 
	
	private String correo;

	public long getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(long iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumext() {
		return numext;
	}

	public void setNumext(String numext) {
		this.numext = numext;
	}

	public String getNumint() {
		return numint;
	}

	public void setNumint(String numint) {
		this.numint = numint;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getTelcasa() {
		return telcasa;
	}

	public void setTelcasa(String telcasa) {
		this.telcasa = telcasa;
	}

	public String getTelmovil() {
		return telmovil;
	}

	public void setTelmovil(String telmovil) {
		this.telmovil = telmovil;
	}

	public String getTeltrabajo() {
		return teltrabajo;
	}

	public void setTeltrabajo(String teltrabajo) {
		this.teltrabajo = teltrabajo;
	}

	public Integer getExt() {
		return ext;
	}

	public void setExt(Integer ext) {
		this.ext = ext;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAlcaldia() {
		return alcaldia;
	}

	public void setAlcaldia(String alcaldia) {
		this.alcaldia = alcaldia;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	} 
	
	
	

}
