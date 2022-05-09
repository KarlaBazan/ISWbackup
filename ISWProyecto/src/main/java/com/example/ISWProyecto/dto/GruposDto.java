package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.Grupos;
import com.example.ISWProyecto.model.Materias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GruposDto {

	@JsonProperty("grupo")
	private String grupo; 
	@JsonProperty("turno")
	private String turno; 

	
	
	public static GruposDto getInstance(Grupos grupo) {
		GruposDto gruposdto = new GruposDto();
		if(grupo!=null) {
			gruposdto.setGrupo(grupo.getGrupo());
			gruposdto.setTurno(grupo.getTurno());
		}
		
		
		return gruposdto;
		
	}
	public static List<GruposDto> getInstance(List<Grupos> grupos) {
		List<GruposDto> gruposDto = new ArrayList<GruposDto>();
		for( Grupos grup: grupos) {
			gruposDto.add(GruposDto.getInstance(grup));
		}
		return gruposDto;
	}
	
	
	
	
	
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
