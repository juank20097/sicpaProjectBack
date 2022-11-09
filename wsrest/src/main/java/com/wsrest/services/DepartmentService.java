package com.wsrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsrest.entities.Department;
import com.wsrest.repo.DepartmentRepo;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepo departmentrepo;
	
	public Department insertUpdate(Department depar) {
		return departmentrepo.save(depar);
	}
	
	public List<Department> getAll() {
		return departmentrepo.findAll();
	}
	
}
