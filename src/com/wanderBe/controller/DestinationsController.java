package com.wanderBe.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.Destinations;
import com.wanderBe.repo.DestinationsRepository;
import com.wanderBe.service.DestinationsService;

@Controller
public class DestinationsController {

	@Autowired
	DestinationsRepository dr;
	
	@Autowired
	DestinationsService ds;
	
	@RequestMapping("/destinations")
	public ModelAndView destinationsHandler1() {
		ModelAndView mav = new ModelAndView("destinations");
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		mav.addObject("desList", getAllDestinations);
		return mav;
	}

	
	@RequestMapping(value="/destinations", method=RequestMethod.POST)
	public String destinationsHandler2(@ModelAttribute("destinations") Destinations destinations) {
		ds.addDestinations(destinations);
		System.out.println("reaching destinations");
		return "destinations";
		

}
}
