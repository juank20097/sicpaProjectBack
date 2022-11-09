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

import com.wsrest.entities.Department;
import com.wsrest.services.DepartmentService;

@RestController
@RequestMapping("/department")
public class DeparmentController {
	
	@Autowired
	private DepartmentService departmentservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Department> getAll(){
		return departmentservice.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public Department insert(@RequestBody Department enter) {
		return departmentservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public Department update(@RequestBody Department enter,@PathVariable("id") int id) {
		enter.setId(id);
		return departmentservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public Optional<Department> getId(@PathVariable("id") int id){
		return departmentservice.getId(id);
	}

}
