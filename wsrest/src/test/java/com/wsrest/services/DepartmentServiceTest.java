package com.wsrest.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.wsrest.entities.Department;
import com.wsrest.repo.DepartmentRepo;

class DepartmentServiceTest {
	
	@Mock
	private DepartmentRepo departrepo;
	
	@InjectMocks
	private DepartmentService departmentService;
	
	private Department department;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		department= new Department();
		department.setId(100);
		department.setStatus(true);
	}
	
	@Test
	void getAll() {
		when(departrepo.findByStatus()).thenReturn(Arrays.asList(department));
		assertNotNull(departmentService.getAll());
	}


}
