package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Receta;

public interface IRecetaService {

	public List<Receta> findAll();
}
