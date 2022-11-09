package com.wsrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.DepartmentsEmployee;

@Repository
public interface DepartmentsEmployeeRepo extends JpaRepository<DepartmentsEmployee, Integer> {
	
}
