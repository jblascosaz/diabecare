package com.diabecare.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diabecare.backend.apirest.models.entity.Ejercicio_diario;

public interface IEjercicio_diarioDao extends CrudRepository<Ejercicio_diario, Long> {

}
