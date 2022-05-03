package com.example.ISWProyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.example.ISWProyecto.model.U_Gest_Esc;

public interface U_Gest_EscRepository extends JpaRepository<U_Gest_Esc, String>{
	@Query("SELECT a FROM U_Gestion_Esc a where a.rfc = :rfc and a.contrasena = :contrasena")
	U_Gest_Esc findU_Gest_Esc(@Param("rfc") String rfc, @Param("contrasena") String contrasena);
}
