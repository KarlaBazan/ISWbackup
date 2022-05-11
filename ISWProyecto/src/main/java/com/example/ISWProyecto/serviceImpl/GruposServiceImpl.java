package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.Grupos;
import com.example.ISWProyecto.repository.GruposRepository;
import com.example.ISWProyecto.service.IGruposService;

@Service("GruposService")
public class GruposServiceImpl implements IGruposService {

	@Autowired
	private GruposRepository grupoRepository;
	@Override
	public List<Grupos> findAll() {
		// TODO Auto-generated method stub
		return grupoRepository.findAll();
	}

	@Override
	public Grupos findGrupoById(String grupo) {
		// TODO Auto-generated method stub
		return grupoRepository.findGrupoById(grupo);
	}

}
