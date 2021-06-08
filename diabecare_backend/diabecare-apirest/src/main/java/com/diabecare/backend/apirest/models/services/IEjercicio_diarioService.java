package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Ejercicio_diario;

public interface IEjercicio_diarioService {

	public List<Ejercicio_diario> findAll();
}
