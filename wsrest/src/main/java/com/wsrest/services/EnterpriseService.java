package com.wsrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsrest.entities.Enterprise;
import com.wsrest.repo.EnterpriseRepo;

@Service
public class EnterpriseService {

	@Autowired
	private EnterpriseRepo enterpriserepo;
	
	public Enterprise insert(Enterprise enter) {
		return enterpriserepo.save(enter);
	}
	
	public Enterprise update(Enterprise enter) {
		return enterpriserepo.save(enter);
	}
	
	public List<Enterprise> getAll() {
		return enterpriserepo.findAll();
	}
	
}
