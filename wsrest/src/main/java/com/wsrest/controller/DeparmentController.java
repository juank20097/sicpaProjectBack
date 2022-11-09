package com.wsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping
	public List<Department> getAll(){
		return departmentservice.getAll();
	}
	
	@PostMapping
	public Department insert(@RequestBody Department enter) {
		return departmentservice.insertUpdate(enter);
	}
	
	@PutMapping
	public Department update(@RequestBody Department enter) {
		return departmentservice.insertUpdate(enter);
	}

}
