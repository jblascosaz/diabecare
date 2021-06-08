package com.diabecare.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.diabecare.backend.apirest.models.entity.Reminder;

public interface IReminderDao extends CrudRepository<Reminder, Long> {

}
