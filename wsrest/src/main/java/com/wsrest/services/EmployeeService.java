package com.wsrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsrest.entities.Employee;
import com.wsrest.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeerepo;
	
	public Employee insertUpdate(Employee depar) {
		return employeerepo.save(depar);
	}
	
	public List<Employee> getAll() {
		return employeerepo.findByStatus();
	}
	
	public Optional<Employee> getId(int id) {
		return employeerepo.findById(id);
	}
	
}
