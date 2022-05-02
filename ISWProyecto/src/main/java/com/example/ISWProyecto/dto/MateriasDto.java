package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Materias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MateriasDto {
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("nombre")
	private String nombre;
	@JsonProperty("semestre")
	private String semestre;
	@JsonProperty("salon")
	private String salon;
	
	
	
	
	public static MateriasDto getInstance(Materias materia) {
		MateriasDto materiasdto = new MateriasDto();
		if(materia!=null) {
			materiasdto.setId(materia.getId());
			materiasdto.setNombre(materia.getNombre());
			materiasdto.setSemestre(materia.getSemestre());
			materiasdto.setSalon(materia.getSalon());
		}
		
		
		
		
		
		
		return materiasdto;
		
	}
	
	public static List<MateriasDto> getInstance(List<Materias> materias) {
		List<MateriasDto> materiasDto = new ArrayList<MateriasDto>();
		for( Materias mat: materias) {
			materiasDto.add(MateriasDto.getInstance(mat));
		}
		return materiasDto;
		
	}
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	
	
	
	
	
	
	
	
	

}
