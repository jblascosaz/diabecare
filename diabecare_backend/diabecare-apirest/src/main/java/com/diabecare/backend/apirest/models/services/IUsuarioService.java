package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
}
