package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;


import com.example.ISWProyecto.model.Direcciones;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DireccionesDto {
	
	@JsonProperty("iddireccion")
	private long iddireccion; 
	
	@JsonProperty("calle")
	private String calle; 
	
	@JsonProperty("numext")
	private String numext; 
	
	@JsonProperty("numint")
	private String numint;
	
	@JsonProperty("cp")
	private Integer cp; 
	
	@JsonProperty("telcasa")
	private String telcasa; 
	
	@JsonProperty("telmovil")
	private String telmovil; 
	
	@JsonProperty("teltrabajo")
	private String teltrabajo; 
	
	@JsonProperty("ext")
	private Integer ext; 
	
	@JsonProperty("estado")
	private String estado; 
	
	@JsonProperty("alcaldia")
	private String alcaldia; 
	
	@JsonProperty("correo")
	private String correo;
	
	
	
	public static DireccionesDto getInstance(Direcciones direcciones) {
		
		DireccionesDto direccionesDto = new DireccionesDto(); 
		if(direcciones!=null) {
			direccionesDto.setIddireccion(direcciones.getIddireccion());
			direccionesDto.setAlcaldia(direcciones.getAlcaldia());
			direccionesDto.setCalle(direcciones.getCalle());
			direccionesDto.setCorreo(direcciones.getCorreo());
			direccionesDto.setCp(direcciones.getCp());
			direccionesDto.setEstado(direcciones.getEstado());
			direccionesDto.setExt(direcciones.getExt());
			direccionesDto.setNumext(direcciones.getNumext());
			direccionesDto.setNumint(direcciones.getNumint());
			direccionesDto.setTelcasa(direcciones.getTelcasa());
			direccionesDto.setTelmovil(direcciones.getTelmovil());
			direccionesDto.setTeltrabajo(direcciones.getTeltrabajo());
			
		}
		return direccionesDto;
	}
	
	
	public static List<DireccionesDto> getInstance(List<Direcciones> direcciones) {
		List<DireccionesDto> direccionesDto = new ArrayList<DireccionesDto>();
		for( Direcciones dir: direcciones) {
			direccionesDto.add(DireccionesDto.getInstance(dir));
		}
		return direccionesDto;
		
	}
	
	
	
	

	public long getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(long l) {
		this.iddireccion = l;
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
