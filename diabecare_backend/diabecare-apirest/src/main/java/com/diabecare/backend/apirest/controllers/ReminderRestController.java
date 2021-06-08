package com.diabecare.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diabecare.backend.apirest.models.entity.Reminder;
import com.diabecare.backend.apirest.models.services.IReminderService;

@RestController
@RequestMapping("/api")
public class ReminderRestController {

	@Autowired
	private IReminderService reminderService;
	
	@GetMapping("/reminders")
	public List<Reminder> index(){
		return reminderService.findAll();
	}
}
