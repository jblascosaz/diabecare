package com.diabecare.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diabecare.backend.apirest.models.entity.Ejercicio;
import com.diabecare.backend.apirest.models.services.IEjercicioService;

@RestController
@RequestMapping("/api")
public class EjercicioRestController {

	@Autowired
	private IEjercicioService ejercicioService;
	
	@GetMapping("/ejercicios")
	public List<Ejercicio> index(){
		return ejercicioService.findAll();
	}
}
