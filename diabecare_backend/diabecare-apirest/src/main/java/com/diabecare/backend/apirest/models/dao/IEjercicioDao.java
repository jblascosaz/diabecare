package com.diabecare.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diabecare.backend.apirest.models.entity.Ejercicio;

public interface IEjercicioDao extends CrudRepository<Ejercicio, Long> {

}
