package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.DatosMedicos;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DatosMedicosDto {
	
	@JsonProperty("num_seg_social")
	private Double num_seg_social; 
	@JsonProperty("estatura")
	private Double estatura; 
	@JsonProperty("peso")
	private Float peso; 
	@JsonProperty("tiposangre")
	private String tiposangre; 
	@JsonProperty("pieplano")
	private Integer pieplano;
	@JsonProperty("problema_fisico")
	private String problema_fisico;
	@JsonProperty("alergia")
	private Integer alergia;
	
	
	
	
	public static DatosMedicosDto getInstance(DatosMedicos datosMedicos) {
		
		DatosMedicosDto datosMedicosDto = new DatosMedicosDto();
		if(datosMedicos!=null) {
			datosMedicosDto.setAlergia(datosMedicos.getAlergia());
			datosMedicosDto.setEstatura(datosMedicos.getEstatura());
			datosMedicosDto.setNum_seg_social(datosMedicos.getNum_seg_social());
			datosMedicosDto.setPeso(datosMedicos.getPeso());
			datosMedicosDto.setPieplano(datosMedicos.getPieplano());
			datosMedicosDto.setProblema_fisico(datosMedicos.getProblema_fisico());
			datosMedicosDto.setTiposangre(datosMedicos.getTiposangre());
		}
		
		
		return datosMedicosDto;
		
	}
	
	
	
	public static List<DatosMedicosDto> getInstance(List<DatosMedicos> datosMedicos) {
		List<DatosMedicosDto> datosMedicosDto = new ArrayList<DatosMedicosDto>();
		for( DatosMedicos datos: datosMedicos) {
			datosMedicosDto.add(DatosMedicosDto.getInstance(datos));
		}
		return datosMedicosDto;
		
	}
	
	
	
	

	public Double getNum_seg_social() {
		return num_seg_social;
	}

	public void setNum_seg_social(Double num_seg_social) {
		this.num_seg_social = num_seg_social;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getTiposangre() {
		return tiposangre;
	}

	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}

	public Integer getPieplano() {
		return pieplano;
	}

	public void setPieplano(Integer pieplano) {
		this.pieplano = pieplano;
	}

	public String getProblema_fisico() {
		return problema_fisico;
	}

	public void setProblema_fisico(String problema_fisico) {
		this.problema_fisico = problema_fisico;
	}

	public Integer getAlergia() {
		return alergia;
	}

	public void setAlergia(Integer alergia) {
		this.alergia = alergia;
	}
	

}
