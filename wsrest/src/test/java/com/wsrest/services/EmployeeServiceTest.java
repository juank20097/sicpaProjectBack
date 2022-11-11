package com.wsrest.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.wsrest.entities.Employee;
import com.wsrest.repo.EmployeeRepo;

class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepo employeerepo;
	
	@InjectMocks
	private EmployeeService employeeService;
	
	private Employee employee;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		employee= new Employee();
		employee.setId(100);
		employee.setStatus(true);
	}
	
	@Test
	void getAll() {
		when(employeerepo.findByStatus()).thenReturn(Arrays.asList(employee));
		assertNotNull(employeeService.getAll());
	}


}
