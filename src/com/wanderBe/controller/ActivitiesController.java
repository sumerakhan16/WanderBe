package com.wanderBe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.Activities;
import com.wanderBe.entities.Destinations;
import com.wanderBe.repo.ActivitiesRepository;
import com.wanderBe.service.ActivitiesService;

@Controller
public class ActivitiesController {

	@Autowired
	ActivitiesRepository ar;
	
	@Autowired
	ActivitiesService as;
	
	
	@RequestMapping("/activities")
	public ModelAndView activitiesHandler() {
		ModelAndView mav = new ModelAndView("activities");
		List<Activities> getAllActivities = as.getAllActivities();
		System.out.println(getAllActivities);
		mav.addObject("actList", getAllActivities);
		return mav;
	}

	
	@RequestMapping(value="/addActivities", method=RequestMethod.POST)
	public ModelAndView ActivityHandler2(@ModelAttribute("activites") Activities activities) {
		as.addActivities(activities);
		List<Activities> getAllActivities = as.getAllActivities();
		System.out.println("TESTING ACTIVITIES" + getAllActivities );
		ModelAndView mav = new ModelAndView("activities");
		mav.addObject("actList", getAllActivities);
		System.out.println("reaching activities");
		return mav;
}
	
	@RequestMapping(value="/editActivities", method=RequestMethod.POST)
	
	public ModelAndView EditActForm(@ModelAttribute("activities") Activities activities) {
		as.updateActivities(activities.getaId(), activities);
		List<Activities> getAllActivities = as.getAllActivities();
		ModelAndView mav = new ModelAndView("activities");
		mav.addObject("actList", getAllActivities);
		return mav;
	}
	
	@RequestMapping(value="/deleteAct{aId}", method=RequestMethod.GET)
	public ModelAndView DeleteActivities(@PathVariable("aId") Integer aId) {
		as.deleteActById(aId);
		List<Activities> getAllActivities = as.getAllActivities();
		ModelAndView mav = new ModelAndView("activities");
		mav.addObject("actList", getAllActivities);
		return mav;
}
}
