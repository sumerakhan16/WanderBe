package com.wanderBe.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
		System.out.println("first");
		ModelAndView mav = new ModelAndView("destinations");
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		System.out.println(getAllDestinations);

		mav.addObject("desList", getAllDestinations);
		return mav;
	}
	
	

	
	@RequestMapping(value="/addDestinations", method=RequestMethod.POST)
	public ModelAndView destinationsHandler2(@ModelAttribute("destinations") Destinations destinations) {
		ds.addDestinations(destinations);
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		System.out.println(getAllDestinations);
		ModelAndView mav = new ModelAndView("destinations");
		mav.addObject("desList", getAllDestinations);
		System.out.println("reaching destinations");
		return mav;
		

}
	@RequestMapping(value="/editDest{dId}", method=RequestMethod.GET)
	public ModelAndView showEditForm(@PathVariable("dId") Integer dId) {
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		ModelAndView mav = new ModelAndView("editDestination");
		Destinations newDest= ds.getDestinations(dId);
		mav.addObject("desList", getAllDestinations);
		mav.addObject("destination", newDest);
		return mav;
}
	
	@RequestMapping(value="/editDestinations", method=RequestMethod.POST)
	
	public ModelAndView EditForm(@ModelAttribute("destinations") Destinations destinations) {
		ds.updateDestinations(destinations.getdId(), destinations);
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		ModelAndView mav = new ModelAndView("destinations");
		mav.addObject("desList", getAllDestinations);
		return mav;
}
	@RequestMapping(value="/deleteDest{dId}", method=RequestMethod.GET)
	public ModelAndView DeleteDestination(@PathVariable("dId") Integer dId) {
		ds.deleteDesById(dId);
		List<Destinations> getAllDestinations = ds.getAllDestinations();
		ModelAndView mav = new ModelAndView("destinations");
		mav.addObject("desList", getAllDestinations);
		return mav;
}
}