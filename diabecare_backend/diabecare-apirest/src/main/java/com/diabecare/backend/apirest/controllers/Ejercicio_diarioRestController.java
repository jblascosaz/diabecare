package com.diabecare.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diabecare.backend.apirest.models.entity.Ejercicio_diario;
import com.diabecare.backend.apirest.models.services.IEjercicio_diarioService;

@RestController
@RequestMapping("/api")
public class Ejercicio_diarioRestController {

	@Autowired
	private IEjercicio_diarioService ejercicio_diarioService;
	
	@GetMapping("/ejercicios_diarios")
	public List<Ejercicio_diario> index(){
		return ejercicio_diarioService.findAll();
	}
}
