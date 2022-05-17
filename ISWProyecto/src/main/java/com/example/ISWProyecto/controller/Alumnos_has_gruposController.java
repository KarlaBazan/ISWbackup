package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.Alumnos_has_gruposDto;
import com.example.ISWProyecto.model.Alumnos_has_grupos;
import com.example.ISWProyecto.serviceImpl.Alumnos_has_gruposServiceImpl;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/Alumnos_has_grupos")
public class Alumnos_has_gruposController {
	
	@Autowired
	Alumnos_has_gruposServiceImpl alumnoshgService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<Alumnos_has_gruposDto>> findAll(){
		List<Alumnos_has_grupos> alumnoshg = alumnoshgService.findAll();
		if(alumnoshg.isEmpty()) {
			return new ResponseEntity<List<Alumnos_has_gruposDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<Alumnos_has_gruposDto> alumnos_has_gruposdto = Alumnos_has_gruposDto.getInstance(alumnoshg);
		return new ResponseEntity<List<Alumnos_has_gruposDto>>(alumnos_has_gruposdto, HttpStatus.OK);
		
	}
}
