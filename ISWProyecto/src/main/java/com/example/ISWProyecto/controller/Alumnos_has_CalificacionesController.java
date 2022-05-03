package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.Alumnos_has_CalificacionesDto;
import com.example.ISWProyecto.model.Alumnos_has_Calificaciones;
import com.example.ISWProyecto.serviceImpl.Alumnos_has_CalificacionesServiceImpl;

@RestController
@RequestMapping("/Alumnos_has_Calificaciones")
public class Alumnos_has_CalificacionesController {

	@Autowired
	Alumnos_has_CalificacionesServiceImpl alumnoshcService;

	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_CalificacionesDto>> findAll(){
		List<Alumnos_has_Calificaciones> alumnoshc = alumnoshcService.findAll();
		if(alumnoshc.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_CalificacionesDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<Alumnos_has_CalificacionesDto> alumnos_has_califdto = Alumnos_has_CalificacionesDto.getInstance(alumnoshc);
		return new ResponseEntity<List<Alumnos_has_CalificacionesDto>>(alumnos_has_califdto, HttpStatus.OK);
		
	}
}
