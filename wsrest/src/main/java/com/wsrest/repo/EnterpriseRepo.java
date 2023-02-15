package com.wsrest.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Enterprise;

@Repository
public interface EnterpriseRepo extends MongoRepository<Enterprise, String> {
	
	 List<Enterprise> findByStatus(boolean status);
}
