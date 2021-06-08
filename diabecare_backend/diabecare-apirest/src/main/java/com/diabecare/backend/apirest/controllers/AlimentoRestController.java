package com.diabecare.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diabecare.backend.apirest.models.entity.Alimento;
import com.diabecare.backend.apirest.models.services.IAlimentoService;

@RestController
@RequestMapping("/api")
public class AlimentoRestController {

	@Autowired
	private IAlimentoService alimentoService;
	
	@GetMapping("/alimentos")
	public List<Alimento> index(){
		return alimentoService.findAll();
	}
}
