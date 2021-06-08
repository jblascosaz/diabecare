package com.diabecare.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.diabecare.backend.apirest.models.dao.IReminderDao;
import com.diabecare.backend.apirest.models.entity.Reminder;


@Service
public class ReminderServiceImpl implements IReminderService {

	@Autowired
	private IReminderDao reminderDao;
	@Override
	@Transactional(readOnly = true)
	public List<Reminder> findAll() {
		// TODO Auto-generated method stub
		return (List<Reminder>) reminderDao.findAll();
	}

}
