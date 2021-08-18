package com.cognizant.ormlearn.springdatajpa.service;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.springdatajpa.model.Department;
import com.cognizant.ormlearn.springdatajpa.repos.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Transactional
	public Department get(int id) {
		LOGGER.info("Start");
		return departmentRepository.findById(id).get();

	}

	@Transactional
	public void save(Department department) {
		LOGGER.info("Start");
		departmentRepository.save(department);
		LOGGER.info("End");
	}
}
