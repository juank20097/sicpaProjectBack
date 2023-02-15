package com.wsrest.services;

import java.util.List;
import java.util.Optional;

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
		return departmentsemployeerepo.findByStatus(true);
	}
	
	public Optional<DepartmentsEmployee> getId(String id) {
		return departmentsemployeerepo.findById(id);
	}
	
	public List<DepartmentsEmployee> getByDepartment(String id) {
		return departmentsemployeerepo.findByDepartmentId(id);
	}
	
	public List<DepartmentsEmployee> getByEmployees(String id) {
		return departmentsemployeerepo.findByEmployeeId(id);
	}
	
	
	
}
