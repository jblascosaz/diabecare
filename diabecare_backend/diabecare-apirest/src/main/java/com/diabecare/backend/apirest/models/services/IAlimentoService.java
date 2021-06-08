package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Alimento;

public interface IAlimentoService {

	public List<Alimento> findAll();
}
