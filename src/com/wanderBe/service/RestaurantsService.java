package com.wanderBe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderBe.entities.Destinations;
import com.wanderBe.entities.Restaurants;
import com.wanderBe.repo.RestaurantsRepository;

@Service
public class RestaurantsService {

	@Autowired
	RestaurantsRepository rr;
	
	public Restaurants addRestaurants(Restaurants restaurants) {
		return rr.save(restaurants);
	}
	
	public Restaurants getRestaurants(Integer rId) {
		return rr.getByrId(rId);
	}
	
	public List<Restaurants> getAllRestaurants() {
		return rr.findAll();
	}
	
	public boolean updateRestaurants(Integer rId, Restaurants restaurants) {
		Restaurants getRest = rr.getByrId(rId);
		
		if (getRest != null) {
			getRest.setrName(restaurants.getrName());
			getRest.setrNotes(restaurants.getrNotes());
			getRest.setrUrl(restaurants.getrUrl());
			rr.save(getRest);
			
		return true;
	}else {
		return false;
	}
			
	}
	
	public boolean deleteRestById(Integer rId) {
		Restaurants deleteRest = rr.getByrId(rId);
		
		if (deleteRest != null) {
			rr.delete(deleteRest);
			
		return true;
	}else {
		return false;
	}
			
	}
}
