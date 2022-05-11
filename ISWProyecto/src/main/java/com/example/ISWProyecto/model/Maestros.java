package com.example.ISWProyecto.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="MAESTROS")
@NamedQuery(name="Maestros.findAll", query="SELECT a FROM Maestros a")
public class Maestros {

	@Id
	private String rfc; 
	
	private String nombre; 
	
	private String paterno; 
	
	private String materno; 
	
	private String curp;  
	
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name="foto")
	private byte[] foto;
	
	private String nacionalidad;
	
	private String grado;
	
	private String contrasena;
	
	private int direcciones_iddireccion;

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getDirecciones_iddireccion() {
		return direcciones_iddireccion;
	}

	public void setDirecciones_iddireccion(int direcciones_iddireccion) {
		this.direcciones_iddireccion = direcciones_iddireccion;
	}
	
	
}


