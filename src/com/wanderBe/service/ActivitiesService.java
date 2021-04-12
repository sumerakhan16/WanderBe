package com.wanderBe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderBe.entities.Activities;
import com.wanderBe.entities.Destinations;
import com.wanderBe.repo.ActivitiesRepository;

@Service
public class ActivitiesService {

	@Autowired
	ActivitiesRepository ar;
	
	public Activities addActivities(Activities activities) {
		return ar.save(activities);
}
	public Activities getActivities(Integer aId) {
		return ar.getOne(aId);
	}
	
	public List<Activities> getAllActivities() {
		return ar.findAll();
	}

	
	public boolean updateActivities(Integer aId, Activities activities) {
		Activities getAct = ar.getOne(aId);
		
		if (getAct != null) {
			getAct.setaName(activities.getaName());
			getAct.setaNotes(activities.getaNotes());
			getAct.setaUrl(activities.getaUrl());
			ar.save(getAct);
			
		return true;
	}else {
		return false;
	}
			
	}
	
	public boolean deleteActById(Integer aId) {
		Activities deleteAct = ar.getByaId(aId);
		
		if (deleteAct != null) {
			ar.delete(deleteAct);
			
		return true;
	}else {
		return false;
	}
			
	}
}