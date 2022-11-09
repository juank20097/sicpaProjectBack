package com.wsrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Employee> getAll(){
		return employeeservice.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public Employee insert(@RequestBody Employee enter) {
		return employeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public Employee update(@RequestBody Employee enter,@PathVariable("id") int id) {
		enter.setId(id);
		return employeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public Optional<Employee> getId(@PathVariable("id") int id){
		return employeeservice.getId(id);
	}

}
