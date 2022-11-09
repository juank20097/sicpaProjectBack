package com.wsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsrest.entities.Employee;
import com.wsrest.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping
	public List<Employee> getAll(){
		return employeeservice.getAll();
	}
	
	@PostMapping
	public Employee insert(@RequestBody Employee enter) {
		return employeeservice.insertUpdate(enter);
	}
	
	@PutMapping
	public Employee update(@RequestBody Employee enter) {
		return employeeservice.insertUpdate(enter);
	}

}
