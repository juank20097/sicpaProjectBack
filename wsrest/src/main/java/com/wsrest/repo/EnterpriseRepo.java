package com.wsrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Enterprise;

@Repository
public interface EnterpriseRepo extends JpaRepository<Enterprise, Integer> {
	
}
