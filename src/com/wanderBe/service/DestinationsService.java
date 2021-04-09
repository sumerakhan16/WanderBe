package com.wanderBe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderBe.entities.Destinations;
import com.wanderBe.repo.DestinationsRepository;

@Service
public class DestinationsService {

	@Autowired
	DestinationsRepository dr;
	
	public Destinations addDestinations(Destinations destinations) {
		return dr.save(destinations);
	}	
	
	public Destinations getDestinations(Integer dId) {
		return dr.getBydId(dId);
	}
	
	public List<Destinations> getAllDestinations() {
		return dr.findAll();
	}
	
	public boolean updateDestinations(Integer dId, Destinations destinations) {
		Destinations getDes = dr.getBydId(dId);
		
		if (getDes != null) {
			getDes.setdName(destinations.getdName());
			getDes.setdImageUrl(destinations.getdImageUrl());
			dr.save(getDes);
			
		return true;
	}else {
		return false;
	}
			
	}
	
	public boolean deleteDesById(Integer dId) {
		Destinations deleteDes = dr.getBydId(dId);
		
		if (deleteDes != null) {
			dr.delete(deleteDes);
			
		return true;
	}else {
		return false;
	}
			
	}
}
