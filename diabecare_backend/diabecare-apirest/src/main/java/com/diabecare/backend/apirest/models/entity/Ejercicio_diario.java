package com.diabecare.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ejercicios_diarios")
public class Ejercicio_diario implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEjerciciosDiarios;
	private int idEjercicio1;
	private int idEjercicio2;
	private int idEjercicio3;
	private Date fecha;
	
	public Long getIdEjerciciosDiarios() {
		return idEjerciciosDiarios;
	}
	public void setIdEjerciciosDiarios(Long idEjerciciosDiarios) {
		this.idEjerciciosDiarios = idEjerciciosDiarios;
	}
	public int getIdEjercicio1() {
		return idEjercicio1;
	}
	public void setIdEjercicio1(int idEjercicio1) {
		this.idEjercicio1 = idEjercicio1;
	}
	public int getIdEjercicio2() {
		return idEjercicio2;
	}
	public void setIdEjercicio2(int idEjercicio2) {
		this.idEjercicio2 = idEjercicio2;
	}
	public int getIdEjercicio3() {
		return idEjercicio3;
	}
	public void setIdEjercicio3(int idEjercicio3) {
		this.idEjercicio3 = idEjercicio3;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
	