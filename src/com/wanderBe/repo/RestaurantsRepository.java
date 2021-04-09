package com.wanderBe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanderBe.entities.Restaurants;

@Repository
public interface RestaurantsRepository extends JpaRepository<Restaurants, Integer>{
	
	Restaurants getByrId(Integer rId);
	
}
