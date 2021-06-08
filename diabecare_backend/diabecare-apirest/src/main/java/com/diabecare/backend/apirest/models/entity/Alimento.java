package com.diabecare.backend.apirest.models.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alimentos")
public class Alimento implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlimento;
	private String nombre;
	private String descripcion;
	private int carbohidratos;
	
	
	public Long getIdAlimento() {
		return idAlimento;
	}
	public void setIdAlimento(Long idAlimento) {
		this.idAlimento = idAlimento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCarbohidratos() {
		return carbohidratos;
	}
	public void setCarbohidratos(int carbohidratos) {
		this.carbohidratos = carbohidratos;
	}
	
	

}