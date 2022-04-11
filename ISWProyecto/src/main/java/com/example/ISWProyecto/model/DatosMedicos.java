package com.example.ISWProyecto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="DATOSMEDICOS")
@NamedQuery(name="DatosMedicos.findAll", query="SELECT a FROM DatosMedicos a")
public class DatosMedicos {
	
	@Id
	private Double num_seg_social; 
	
	private Double estatura; 
	
	private Float peso; 
	
	private String tiposangre; 
	
	private Integer pieplano;
	
	private String problema_fisico;
	
	private Integer alergia;

	public Double getNum_seg_social() {
		return num_seg_social;
	}

	public void setNum_seg_social(Double num_seg_social) {
		this.num_seg_social = num_seg_social;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getTiposangre() {
		return tiposangre;
	}

	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}

	public Integer getPieplano() {
		return pieplano;
	}

	public void setPieplano(Integer pieplano) {
		this.pieplano = pieplano;
	}

	public String getProblema_fisico() {
		return problema_fisico;
	}

	public void setProblema_fisico(String problema_fisico) {
		this.problema_fisico = problema_fisico;
	}

	public Integer getAlergia() {
		return alergia;
	}

	public void setAlergia(Integer alergia) {
		this.alergia = alergia;
	}
	
	
	

}
