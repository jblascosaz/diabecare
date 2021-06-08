package com.diabecare.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diabecare.backend.apirest.models.entity.Alimento;

public interface IAlimentoDao extends CrudRepository<Alimento, Long> {

}