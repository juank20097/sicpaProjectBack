package com.wsrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	
	 @Query("select a from Department a where a.status = true")
	 List<Department> findByStatus();
	
}
