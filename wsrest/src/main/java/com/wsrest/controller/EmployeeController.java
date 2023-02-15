package com.wsrest.controller;

import java.util.List;

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
	
	@CrossOrigin(origins = "*")
	@GetMapping
	public List<Employee> getAll(){
		return employeeservice.getAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping
	public Employee insert(@RequestBody Employee enter) {
		return employeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping(path = {"/{id}"})
	public Employee update(@RequestBody Employee enter,@PathVariable("id") String id) {
		enter.setId(id);
		return employeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = {"/{id}"})
	public Employee getId(@PathVariable("id") String id){
		return employeeservice.getId(id).get();
	}

}
