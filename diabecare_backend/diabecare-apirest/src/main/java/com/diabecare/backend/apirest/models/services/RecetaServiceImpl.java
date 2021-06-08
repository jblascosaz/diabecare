package com.diabecare.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diabecare.backend.apirest.models.dao.IRecetaDao;
import com.diabecare.backend.apirest.models.entity.Receta;


@Service
public class RecetaServiceImpl implements IRecetaService {

	@Autowired
	private IRecetaDao recetaDao;
	@Override
	@Transactional(readOnly = true)
	public List<Receta> findAll() {
		// TODO Auto-generated method stub
		return (List<Receta>) recetaDao.findAll();
	}

}
