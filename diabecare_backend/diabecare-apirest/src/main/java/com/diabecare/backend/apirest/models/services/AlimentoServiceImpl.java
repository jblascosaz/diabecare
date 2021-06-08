package com.diabecare.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diabecare.backend.apirest.models.dao.IAlimentoDao;
import com.diabecare.backend.apirest.models.entity.Alimento;


@Service
public class AlimentoServiceImpl implements IAlimentoService {

	@Autowired
	private IAlimentoDao alimentoDao;
	@Override
	@Transactional(readOnly = true)
	public List<Alimento> findAll() {
		// TODO Auto-generated method stub
		return (List<Alimento>) alimentoDao.findAll();
	}

}
