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

import com.wsrest.entities.DepartmentsEmployee;
import com.wsrest.services.DepartmentsEmployeeService;

@RestController
@RequestMapping("/departmentemployee")
public class DeparmentEmployeeController {
	
	@Autowired
	private DepartmentsEmployeeService departmentemployeeservice;
	
	@CrossOrigin(origins = "*")
	@GetMapping
	public List<DepartmentsEmployee> getAll(){
		return departmentemployeeservice.getAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping
	public DepartmentsEmployee insert(@RequestBody DepartmentsEmployee enter) {
		return departmentemployeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping(path = {"/{id}"})
	public DepartmentsEmployee update(@RequestBody DepartmentsEmployee enter,@PathVariable("id") String id) {
		enter.setId(id);
		return departmentemployeeservice.insertUpdate(enter);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = {"/{id}"})
	public DepartmentsEmployee getId(@PathVariable("id") String id){
		return departmentemployeeservice.getId(id).get();
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = {"/department/{id}"})
	public List<DepartmentsEmployee> getDepartments(@PathVariable("id") String id){
		return departmentemployeeservice.getByDepartment(id);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = {"/employee/{id}"})
	public List<DepartmentsEmployee> getEmployees(@PathVariable("id") String id){
		return departmentemployeeservice.getByEmployees(id);
	}


}
