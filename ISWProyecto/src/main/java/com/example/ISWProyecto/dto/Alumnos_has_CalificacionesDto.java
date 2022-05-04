package com.example.ISWProyecto.dto;

import java.util.ArrayList;
import java.util.List;
import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Alumnos_has_CalificacionesDto {
	
	@JsonProperty("alumnos_boleta")
	private String alumnos_boleta;
	@JsonProperty("calificaciones_materias_idmateria")
	private String calificaciones_materias_idmateria;
	
	
	
	
	public static Alumnos_has_CalificacionesDto getInstance(Alumnos_has_Calificaciones alumnos_has_calif) {
		Alumnos_has_CalificacionesDto alumnos_has_califdto = new Alumnos_has_CalificacionesDto();
		if(alumnos_has_calif!=null) {
			alumnos_has_califdto.setAlumnos_boleta(alumnos_has_calif.getAlumnos_boleta());
			alumnos_has_califdto.setCalificaciones_materias_idmateria(alumnos_has_calif.getCalificaciones_materias_idmateria());
		}
		return alumnos_has_califdto;
		
	}
	public static List<Alumnos_has_CalificacionesDto> getInstance(List<Alumnos_has_Calificaciones> alumnos_has_calif) {
		List<Alumnos_has_CalificacionesDto> alumnos_has_califdto = new ArrayList<Alumnos_has_CalificacionesDto>();
		for( Alumnos_has_Calificaciones alh: alumnos_has_calif) {
			alumnos_has_califdto.add(Alumnos_has_CalificacionesDto.getInstance(alh));
		}
		return alumnos_has_califdto;
		
	}
	public String getAlumnos_boleta() {
		return alumnos_boleta;
	}
	public void setAlumnos_boleta(String alumnos_boleta) {
		this.alumnos_boleta = alumnos_boleta;
	}
	public String getCalificaciones_materias_idmateria() {
		return calificaciones_materias_idmateria;
	}
	public void setCalificaciones_materias_idmateria(String calificaciones_materias_idmateria) {
		this.calificaciones_materias_idmateria = calificaciones_materias_idmateria;
	}
	
	
	
	

	

}
