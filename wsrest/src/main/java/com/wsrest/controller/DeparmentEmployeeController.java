package com.wsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wsrest.entities.DepartmentsEmployee;
import com.wsrest.services.DepartmentsEmployeeService;

@RestController
@RequestMapping("/departmentemployee")
public class DeparmentEmployeeController {
	
	@Autowired
	private DepartmentsEmployeeService departmentemployeeservice;
	
	@GetMapping
	public List<DepartmentsEmployee> getAll(){
		return departmentemployeeservice.getAll();
	}
	
	@PostMapping
	public DepartmentsEmployee insert(@RequestBody DepartmentsEmployee enter) {
		return departmentemployeeservice.insertUpdate(enter);
	}
	
	@PutMapping
	public DepartmentsEmployee update(@RequestBody DepartmentsEmployee enter) {
		return departmentemployeeservice.insertUpdate(enter);
	}

}
