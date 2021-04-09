package com.wanderBe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.Activities;
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
//		mav.addObject("activities", activitiesHandler());
		return mav;
	}
	
	@RequestMapping(value="/activities", method=RequestMethod.POST)
	public String activitiesHandler(@ModelAttribute("activities") Activities activities) {
		as.addActivities(activities);
		return "activities";
		

}
}
