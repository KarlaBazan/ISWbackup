package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.ISWProyecto.model.Materias;

public interface MateriasRepository extends JpaRepository<Materias, String> {
	
	@Query("SELECT a FROM Materias a where a.idmateria = :idmateria")
	Materias findMateriaById(@Param("idmateria") String idmateria);
	
	
}
