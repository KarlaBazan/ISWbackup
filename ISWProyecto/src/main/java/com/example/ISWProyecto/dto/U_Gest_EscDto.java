package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.U_Gest_Esc;
import com.fasterxml.jackson.annotation.JsonProperty;

public class U_Gest_EscDto {
	
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
	@JsonProperty("contrasena")
	private String contrasena;
	
	
	
	public static U_Gest_EscDto getInstance(U_Gest_Esc u_gest_esc) {
		U_Gest_EscDto u_gest_escdto = new U_Gest_EscDto();
		if(u_gest_esc!=null) {
			u_gest_escdto.setRfc(u_gest_esc.getRfc());
			u_gest_escdto.setNombre(u_gest_esc.getNombre());
			u_gest_escdto.setPaterno(u_gest_esc.getPaterno());
			u_gest_escdto.setMaterno(u_gest_esc.getMaterno());
			u_gest_escdto.setCurp(u_gest_esc.getCurp());
			u_gest_escdto.setFoto(u_gest_esc.getFoto());
			u_gest_escdto.setNacionalidad(u_gest_esc.getNacionalidad());
			u_gest_escdto.setContrasena(u_gest_esc.getContrasena());
		}
		return u_gest_escdto;
		
	}
	public static List<U_Gest_EscDto> getInstance(List<U_Gest_Esc> u_gest_esc) {
		List<U_Gest_EscDto> u_gest_escDto = new ArrayList<U_Gest_EscDto>();
		for( U_Gest_Esc uge: u_gest_esc) {
			u_gest_escDto.add(U_Gest_EscDto.getInstance(uge));
		}
		return u_gest_escDto;
		
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
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

}
