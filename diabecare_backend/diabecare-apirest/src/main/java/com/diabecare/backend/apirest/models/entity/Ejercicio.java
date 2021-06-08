package com.diabecare.backend.apirest.models.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ejercicios")
public class Ejercicio implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEjercicio;
	private String ejercicio;
	private String ejercicio_descripcion;
	private int dificultad;
	
	public Long getIdEjercicio() {
		return idEjercicio;
	}
	public void setIdEjercicio(Long idEjercicio) {
		this.idEjercicio = idEjercicio;
	}
	public String getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
	public String getEjercicio_descripcion() {
		return ejercicio_descripcion;
	}
	public void setEjercicio_descripcion(String ejercicio_descripcion) {
		this.ejercicio_descripcion = ejercicio_descripcion;
	}
	public int getDificultad() {
		return dificultad;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}
	
	
}
	