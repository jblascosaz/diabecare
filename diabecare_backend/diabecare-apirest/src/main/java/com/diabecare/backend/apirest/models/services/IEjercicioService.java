package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Ejercicio;

public interface IEjercicioService {

	public List<Ejercicio> findAll();
}
