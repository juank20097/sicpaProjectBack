package com.wsrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	 @Query("select a from Employee a where a.status = true")
	 List<Employee> findByStatus();
}
