package com.wsrest.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.wsrest.entities.DepartmentsEmployee;
import com.wsrest.repo.DepartmentsEmployeeRepo;

class DepartmentsEmployeeServiceTest {
	
	@Mock
	private DepartmentsEmployeeRepo departrepo;
	
	@InjectMocks
	private DepartmentsEmployeeService departmentService;
	
	private DepartmentsEmployee department;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		department= new DepartmentsEmployee();
		department.setId(100);
		department.setStatus(true);
	}

	@Test
	void getAll() {
		when(departrepo.findByStatus()).thenReturn(Arrays.asList(department));
		assertNotNull(departmentService.getAll());
	}

}
