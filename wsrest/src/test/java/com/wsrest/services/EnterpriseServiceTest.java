package com.wsrest.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.wsrest.entities.Enterprise;
import com.wsrest.repo.EnterpriseRepo;

class EnterpriseServiceTest {
	
	@Mock
	private EnterpriseRepo enterpriserepo;
	
	@InjectMocks
	private EnterpriseService enterpriseService;
	
	private Enterprise enterprise;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		
		enterprise= new Enterprise();
		enterprise.setName("Test");
		enterprise.setPhone("0980365958");
		enterprise.setAddress("Av. Test");
		enterprise.setStatus(true); 
		enterprise.setId(100);
	}
	
	@Test
	void getAll() {
		when(enterpriserepo.findByStatus()).thenReturn(Arrays.asList(enterprise));
		assertNotNull(enterpriseService.getAll());
	}

}
