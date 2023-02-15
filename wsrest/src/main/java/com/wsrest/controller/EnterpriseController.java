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

import com.wsrest.entities.Enterprise;
import com.wsrest.services.EnterpriseService;

@RestController
@RequestMapping("/enterprise")
public class EnterpriseController {
	
	@Autowired
	private EnterpriseService enterpriseservice;
	
	@CrossOrigin(origins = "*")
	@GetMapping
	public List<Enterprise> getAll(){
		return enterpriseservice.getAll();
	}
	
	@CrossOrigin(origins = "*")
	@PostMapping
	public Enterprise insert(@RequestBody Enterprise enter) {
		return enterpriseservice.insert(enter);
	}
	
	@CrossOrigin(origins = "*")
	@PutMapping(path = {"/{id}"})
	public Enterprise update(@RequestBody Enterprise enter,@PathVariable("id") String id) {
		enter.setId(id);
		return enterpriseservice.update(enter);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping(path = {"/{id}"})
	public Enterprise getId(@PathVariable("id") String id){
		return enterpriseservice.getId(id).get();
	}

}
