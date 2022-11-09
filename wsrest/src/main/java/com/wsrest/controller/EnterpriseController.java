package com.wsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping
	public List<Enterprise> getAll(){
		return enterpriseservice.getAll();
	}
	
	@PostMapping
	public Enterprise insert(@RequestBody Enterprise enter) {
		return enterpriseservice.insert(enter);
	}
	
	@PutMapping
	public Enterprise update(@RequestBody Enterprise enter) {
		return enterpriseservice.update(enter);
	}

}
