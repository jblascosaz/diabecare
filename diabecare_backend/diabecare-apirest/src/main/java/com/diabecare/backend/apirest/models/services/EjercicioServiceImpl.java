package com.diabecare.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diabecare.backend.apirest.models.dao.IEjercicioDao;
import com.diabecare.backend.apirest.models.entity.Ejercicio;


@Service
public class EjercicioServiceImpl implements IEjercicioService {

	@Autowired
	private IEjercicioDao ejercicioDao;
	@Override
	@Transactional(readOnly = true)
	public List<Ejercicio> findAll() {
		// TODO Auto-generated method stub
		return (List<Ejercicio>) ejercicioDao.findAll();
	}

}
