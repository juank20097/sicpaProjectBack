package com.wsrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsrest.entities.DepartmentsEmployee;
import com.wsrest.repo.DepartmentsEmployeeRepo;

@Service
public class DepartmentsEmployeeService {

	@Autowired
	private DepartmentsEmployeeRepo departmentsemployeerepo;
	
	public DepartmentsEmployee insertUpdate(DepartmentsEmployee depar) {
		return departmentsemployeerepo.save(depar);
	}
	
	public List<DepartmentsEmployee> getAll() {
		return departmentsemployeerepo.findAll();
	}
	
}
