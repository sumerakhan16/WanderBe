package com.wanderBe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.Activities;
import com.wanderBe.entities.Destinations;
import com.wanderBe.repo.ActivitiesRepository;
import com.wanderBe.service.ActivitiesService;
import com.wanderBe.service.DestinationsService;

@Controller
public class ActivitiesController {

	@Autowired
	ActivitiesRepository ar;
	
	@Autowired
	ActivitiesService as;
	
	@Autowired
	DestinationsService ds;
	
	
	@RequestMapping("/activities")
	public ModelAndView activitiesHandler() {
		ModelAndView mav = new ModelAndView("activities");
		List<Activities> getAllActivities = as.getAllActivities();
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		System.out.println(getAllActivities);
		mav.addObject("actList", getAllActivities);
		mav.addObject("desList", getAllDestinations);
		return mav;
	}

	
	@RequestMapping(value="/addActivities", method=RequestMethod.POST)
	public ModelAndView ActivityHandler2(@RequestParam("dId") Integer dId, @RequestParam("aName") String aName, @RequestParam("aNotes") String aNotes, @RequestParam("aUrl") String aUrl) {
		Activities activities = new Activities();
		activities.setaName(aName);
		activities.setaNotes(aNotes);
		activities.setaUrl(aUrl);
		as.addActivities(activities);
		List<Activities> getAllActivities = as.getAllActivities();
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		as.addActivities(activities);
		Destinations dest = ds.getDestinations(dId);
		List<Activities> acts = dest.getActivities();
		acts.add(activities);
		dest.setActivities(acts);
		ds.updateDestinations(dId, dest);
		//System.out.println("TESTING ACTIVITIES" + getAllActivities );
		ModelAndView mav = new ModelAndView("activities");
		mav.addObject("desList", getAllDestinations);
		mav.addObject("actList", getAllActivities);
		System.out.println("reaching activities");
		return mav;
}
	@RequestMapping(value="/dropMenu", method=RequestMethod.GET) 
		public ModelAndView dropMenu(@RequestParam("dId") Integer dId) {
		List<Activities> getAllActivities = ds.getDestinations(dId).getActivities();
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		ModelAndView mav = new ModelAndView("activities");
		mav.addObject("desList", getAllDestinations);
		mav.addObject("actList", getAllActivities);
		return mav;
	}
	
	@RequestMapping(value="/editAct{aId}", method=RequestMethod.GET)
	public ModelAndView ActEditForm(@PathVariable("aId") Integer aId) {
		List<Activities> getAllActivities = as.getAllActivities();
		ModelAndView mav = new ModelAndView("editActivity");
		Activities newAct= as.getActivities(aId);
		mav.addObject("actList", getAllActivities);
		mav.addObject("activity", newAct);
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
