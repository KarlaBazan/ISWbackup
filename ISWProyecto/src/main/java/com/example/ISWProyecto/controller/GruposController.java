package com.example.ISWProyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.ISWProyecto.dto.GruposDto;
import com.example.ISWProyecto.model.Grupos;
import com.example.ISWProyecto.serviceImpl.GruposServiceImpl;

@RestController
@RequestMapping("/Grupos")
public class GruposController {
	@Autowired 
	GruposServiceImpl gruposService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public ResponseEntity<List<GruposDto>> findAll(){
		List<Grupos> grupos = gruposService.findAll();
		if(grupos.isEmpty()) {
			return new ResponseEntity<List<GruposDto>>(HttpStatus.NOT_FOUND);
		}
		
		List<GruposDto> gruposDto = GruposDto.getInstance(grupos);
		return new ResponseEntity<List<GruposDto>>(gruposDto, HttpStatus.OK);
		
	}
}
