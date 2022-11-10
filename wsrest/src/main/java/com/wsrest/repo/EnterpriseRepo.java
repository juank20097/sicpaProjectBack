package com.wsrest.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wsrest.entities.Enterprise;

@Repository
public interface EnterpriseRepo extends JpaRepository<Enterprise, Integer> {
	
	 @Query("select a from Enterprise a where a.status = true")
	 List<Enterprise> findByStatus();
	
}
