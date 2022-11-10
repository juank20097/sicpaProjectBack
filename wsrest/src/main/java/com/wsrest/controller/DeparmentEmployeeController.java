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

import com.wsrest.entities.DepartmentsEmployee;
import com.wsrest.services.DepartmentsEmployeeService;

@RestController
@RequestMapping("/departmentemployee")
public class DeparmentEmployeeController {
	
	@Autowired
	private DepartmentsEmployeeService departmentemployeeservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<DepartmentsEmployee> getAll(){
		return departmentemployeeservice.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public DepartmentsEmployee insert(@RequestBody DepartmentsEmployee enter) {
		return departmentemployeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public DepartmentsEmployee update(@RequestBody DepartmentsEmployee enter,@PathVariable("id") int id) {
		enter.setId(id);
		return departmentemployeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public Optional<DepartmentsEmployee> getId(@PathVariable("id") int id){
		return departmentemployeeservice.getId(id);
	}


}
