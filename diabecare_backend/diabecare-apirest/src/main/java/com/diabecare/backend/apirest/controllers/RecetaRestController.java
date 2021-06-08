package com.diabecare.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diabecare.backend.apirest.models.entity.Receta;
import com.diabecare.backend.apirest.models.services.IRecetaService;

@RestController
@RequestMapping("/api")
public class RecetaRestController {

	@Autowired
	private IRecetaService recetaService;
	
	@GetMapping("/recetas")
	public List<Receta> index(){
		return recetaService.findAll();
	}
}
