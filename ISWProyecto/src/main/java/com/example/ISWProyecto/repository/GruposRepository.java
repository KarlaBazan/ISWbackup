package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Grupos;


public interface GruposRepository  extends JpaRepository<Grupos, String>{

	@Query("SELECT a FROM Grupos a where a.grupo = :grupo")
	Grupos findGrupoById(@Param("grupo") String grupo);
}
