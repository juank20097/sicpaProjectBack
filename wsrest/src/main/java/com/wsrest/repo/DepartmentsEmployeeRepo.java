package com.wsrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.DepartmentsEmployee;

@Repository
public interface DepartmentsEmployeeRepo extends JpaRepository<DepartmentsEmployee, Integer> {
	
	@Query("select a from DepartmentsEmployee a where a.status = true")
	 List<DepartmentsEmployee> findByStatus();
	
	@Query("select a from DepartmentsEmployee a where a.department.id = ?1")
	 List<DepartmentsEmployee> findByDepartments(int id);
	
	@Query("select a from DepartmentsEmployee a where a.employee.id = ?1")
	 List<DepartmentsEmployee> findByEmployees(int id);
	
}
