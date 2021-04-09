package com.wanderBe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanderBe.entities.Destinations;

@Repository
public interface DestinationsRepository  extends JpaRepository<Destinations, Integer>{
	
	 Destinations getBydId(Integer dId);
	
	}
