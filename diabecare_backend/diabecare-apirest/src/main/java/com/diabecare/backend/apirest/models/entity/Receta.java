package com.diabecare.backend.apirest.models.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="recetas")
public class Receta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReceta;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String imagen;
	private String alergenos;
	
	public Long getIdReceta() {
		return idReceta;
	}
	public void setIdReceta(Long idReceta) {
		this.idReceta = idReceta;
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
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getAlergenos() {
		return alergenos;
	}
	public void setAlergenos(String alergenos) {
		this.alergenos = alergenos;
	}

	
}
	