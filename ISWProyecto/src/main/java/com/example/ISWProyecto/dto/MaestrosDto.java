package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Maestros;
import com.example.ISWProyecto.model.U_Gestion_Esc;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MaestrosDto {
	
	@JsonProperty("rfc")
	private String rfc; 
	@JsonProperty("nombre")
	private String nombre; 
	@JsonProperty("paterno")
	private String paterno; 
	@JsonProperty("materno")
	private String materno; 
	@JsonProperty("curp")
	private String curp;  
	@JsonProperty("foto")
	private byte[] foto;
	@JsonProperty("nacionalidad")
	private String nacionalidad;
	@JsonProperty("grado")
	private String grado;
	@JsonProperty("contrasena")
	private String contrasena;
	@JsonProperty("direcciones_iddireccion")
	private int direcciones_iddireccion;
	
	
	public static MaestrosDto getInstance(Maestros maestro) {
		MaestrosDto maestrodto = new MaestrosDto();
		if(maestro!=null) {
			maestrodto.setRfc(maestro.getRfc());
			maestrodto.setNombre(maestro.getNombre());
			maestrodto.setPaterno(maestro.getPaterno());
			maestrodto.setMaterno(maestro.getMaterno());
			maestrodto.setCurp(maestro.getCurp());
			maestrodto.setFoto(maestro.getFoto());
			maestrodto.setNacionalidad(maestro.getNacionalidad());
			maestrodto.setGrado(maestro.getGrado());
			maestrodto.setContrasena(maestro.getContrasena());
			maestrodto.setDirecciones_iddireccion(maestro.getDirecciones_iddireccion());
		}
		return maestrodto;
		
	}
	
	public static List<MaestrosDto> getInstance(List<Maestros> maestros) {
		List<MaestrosDto> maestrosDto = new ArrayList<MaestrosDto>();
		for( Maestros ma: maestros) {
			maestrosDto.add(MaestrosDto.getInstance(ma));
		}
		return maestrosDto;
		
	}
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
