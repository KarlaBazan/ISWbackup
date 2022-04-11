package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ISWProyecto.model.DatosMedicos;

public interface DatosMedicosRepository extends JpaRepository<DatosMedicos, String> {
	
	 
	@Query("SELECT a FROM DatosMedicos a where a.num_seg_social = :num_seg_social")
	DatosMedicos findDatos(@Param("num_seg_social") Double num_seg_social);
	
	
	

}
