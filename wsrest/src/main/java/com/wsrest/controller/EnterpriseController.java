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

import com.wsrest.entities.Enterprise;
import com.wsrest.services.EnterpriseService;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	private EnterpriseService enterpriseservice;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<Enterprise> getAll(){
		return enterpriseservice.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping
	public Enterprise insert(@RequestBody Enterprise enter) {
		return enterpriseservice.insert(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping(path = {"/{id}"})
	public Enterprise update(@RequestBody Enterprise enter,@PathVariable("id") int id) {
		enter.setId(id);
		return enterpriseservice.update(enter);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(path = {"/{id}"})
	public Optional<Enterprise> getId(@PathVariable("id") int id){
		return enterpriseservice.getId(id);
	}

}
