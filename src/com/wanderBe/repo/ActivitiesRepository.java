package com.wanderBe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wanderBe.entities.Activities;

@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Integer> {
		
		 Activities getByaId(Integer aId);
		
		
}
