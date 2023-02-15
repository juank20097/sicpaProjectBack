package com.wsrest.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Employee;

@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String> {
	
	 List<Employee> findByStatus(boolean status);
}
