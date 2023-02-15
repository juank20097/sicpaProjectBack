package com.wsrest.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.DepartmentsEmployee;

@Repository
public interface DepartmentsEmployeeRepo extends MongoRepository<DepartmentsEmployee, String> {
	
	 List<DepartmentsEmployee> findByStatus(boolean status);
	
	 List<DepartmentsEmployee> findByDepartmentId(String id);
	 
	 List<DepartmentsEmployee> findByEmployeeId(String id);
	
}
