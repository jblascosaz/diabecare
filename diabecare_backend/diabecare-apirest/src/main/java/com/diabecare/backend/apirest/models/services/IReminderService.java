package com.diabecare.backend.apirest.models.services;

import java.util.List;

import com.diabecare.backend.apirest.models.entity.Reminder;

public interface IReminderService {

	public List<Reminder> findAll();
}
