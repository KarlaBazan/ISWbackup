package com.example.ISWProyecto.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ISWProyecto.model.U_Gest_Esc;
import com.example.ISWProyecto.repository.U_Gest_EscRepository;
import com.example.ISWProyecto.service.IU_Gest_EscService;

@Service("U_GestionEscService")
public class U_Gest_EscServiceImpl implements IU_Gest_EscService{

	@Autowired
	private U_Gest_EscRepository u_gest_escRepository;
	@Override
	public U_Gest_Esc findU_Gest_Esc(String rfc, String contrasena) {
		// TODO Auto-generated method stub
		return u_gest_escRepository.findU_Gest_Esc(rfc, contrasena)
				;
	}

	@Override
	public List<U_Gest_Esc> findAll() {
		// TODO Auto-generated method stub
		return u_gest_escRepository.findAll();
	}

}
