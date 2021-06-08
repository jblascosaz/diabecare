package com.diabecare.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diabecare.backend.apirest.models.dao.IEjercicio_diarioDao;
import com.diabecare.backend.apirest.models.entity.Ejercicio_diario;


@Service
public class Ejercicio_diarioServiceImpl implements IEjercicio_diarioService {

	@Autowired
	private IEjercicio_diarioDao ejercicio_diarioDao;
	@Override
	@Transactional(readOnly = true)
	public List<Ejercicio_diario> findAll() {
		// TODO Auto-generated method stub
		return (List<Ejercicio_diario>) ejercicio_diarioDao.findAll();
	}

}
