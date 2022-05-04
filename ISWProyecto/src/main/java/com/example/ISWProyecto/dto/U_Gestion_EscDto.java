package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import com.example.ISWProyecto.model.U_Gestion_Esc;
import com.fasterxml.jackson.annotation.JsonProperty;

public class U_Gestion_EscDto {
	
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
	
	
	
	public static U_Gestion_EscDto getInstance(U_Gestion_Esc u_gestion_esc) {
		U_Gestion_EscDto u_gestion_escdto = new U_Gestion_EscDto();
		if(u_gestion_esc!=null) {
			u_gestion_escdto.setRfc(u_gestion_esc.getRfc());
			u_gestion_escdto.setNombre(u_gestion_esc.getNombre());
			u_gestion_escdto.setPaterno(u_gestion_esc.getPaterno());
			u_gestion_escdto.setMaterno(u_gestion_esc.getMaterno());
			u_gestion_escdto.setCurp(u_gestion_esc.getCurp());
			u_gestion_escdto.setFoto(u_gestion_esc.getFoto());
			u_gestion_escdto.setNacionalidad(u_gestion_esc.getNacionalidad());
			u_gestion_escdto.setContrasena(u_gestion_esc.getContrasena());
		}
		return u_gestion_escdto;
		
	}
	public static List<U_Gestion_EscDto> getInstance(List<U_Gestion_Esc> u_gestion_esc) {
		List<U_Gestion_EscDto> u_gestion_escdto = new ArrayList<U_Gestion_EscDto>();
		for( U_Gestion_Esc uge: u_gestion_esc) {
			u_gestion_escdto.add(U_Gestion_EscDto.getInstance(uge));
		}
		return u_gestion_escdto;
		
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
