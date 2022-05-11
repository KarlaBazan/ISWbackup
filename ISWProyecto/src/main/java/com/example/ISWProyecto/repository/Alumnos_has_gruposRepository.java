package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.Alumnos_has_grupos;

public interface Alumnos_has_gruposRepository  extends JpaRepository<Alumnos_has_grupos, String> {
	@Query("SELECT a FROM Alumnos_has_grupos a where a.alumnos_boleta = :alumnos_boleta")
	Alumnos_has_grupos findAlumnoHGById(@Param("alumnos_boleta") String alumnos_boleta);

}
