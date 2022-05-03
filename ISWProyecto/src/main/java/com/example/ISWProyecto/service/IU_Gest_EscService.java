package com.example.ISWProyecto.service;

import java.util.List;

import com.example.ISWProyecto.model.U_Gest_Esc;

public interface IU_Gest_EscService {
	U_Gest_Esc findU_Gest_Esc(String rfc, String contrasena);
	
	List<U_Gest_Esc> findAll();
}
