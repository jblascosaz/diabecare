package com.diabecare.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diabecare.backend.apirest.models.entity.Receta;

public interface IRecetaDao extends CrudRepository<Receta, Long> {

}
