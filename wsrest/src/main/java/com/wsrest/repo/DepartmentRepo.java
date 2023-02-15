package com.wsrest.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Department;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, String> {
	
	 List<Department> findByStatus(boolean status);
}
