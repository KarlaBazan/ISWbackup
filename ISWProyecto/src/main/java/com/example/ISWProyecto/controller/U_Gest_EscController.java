package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ISWProyecto.dto.U_Gest_EscDto;
import com.example.ISWProyecto.model.U_Gest_Esc;
import com.example.ISWProyecto.serviceImpl.U_Gest_EscServiceImpl;
@RestController
@RequestMapping("/U_Gestion_Esc")
public class U_Gest_EscController {
	@Autowired 
	private U_Gest_EscServiceImpl u_gest_escService;
	
	@RequestMapping(value="/findU_Gestion_Esc/{rfc}/{contrasena}", method= RequestMethod.GET)
	public ResponseEntity<U_Gest_EscDto> findAlumno(@PathVariable("rfc") String rfc, @PathVariable("contrasena") String contrasena){
		U_Gest_Esc u_gest_esc = u_gest_escService.findU_Gest_Esc(rfc, contrasena);
		if(u_gest_esc == null) {
			return new ResponseEntity<U_Gest_EscDto>(U_Gest_EscDto.getInstance(u_gest_esc), HttpStatus.NO_CONTENT); 
		}
		
		U_Gest_EscDto u_gest_escDto = U_Gest_EscDto.getInstance(u_gest_esc);
		return new ResponseEntity<U_Gest_EscDto>(u_gest_escDto, HttpStatus.OK);
		
	}
	
	
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<U_Gest_EscDto>> findAll(){
		List<U_Gest_Esc> u_gest_esc = u_gest_escService.findAll();
		if(u_gest_esc.isEmpty()) {
			return new ResponseEntity<List<U_Gest_EscDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<U_Gest_EscDto> u_gest_escDto = U_Gest_EscDto.getInstance(u_gest_esc);
		return new ResponseEntity<List<U_Gest_EscDto>>(u_gest_escDto, HttpStatus.OK);
		
	}
}
