package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.AlumnoDto;
import com.example.ISWProyecto.dto.MateriasDto;
import com.example.ISWProyecto.model.Alumno;
import com.example.ISWProyecto.model.Materias;
import com.example.ISWProyecto.serviceImpl.MateriasServiceImpl;

@RestController
@RequestMapping("/Materias")
public class MateriasController {
	
	@Autowired 
	MateriasServiceImpl materiasService;
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<MateriasDto>> findAll(){
		List<Materias> materias = materiasService.findAll();
		if(materias.isEmpty()) {
			return new ResponseEntity<List<MateriasDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<MateriasDto> materiasDto = MateriasDto.getInstance(materias);
		return new ResponseEntity<List<MateriasDto>>(materiasDto, HttpStatus.OK);
		
	}

}
