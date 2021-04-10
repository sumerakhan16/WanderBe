package com.wanderBe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.Destinations;
import com.wanderBe.entities.Restaurants;
import com.wanderBe.repo.RestaurantsRepository;
import com.wanderBe.service.RestaurantsService;

public class RestaurantsController {

	@Autowired
	RestaurantsRepository rr;
	
	@Autowired
	RestaurantsService rs;
	
	@RequestMapping("/restaurants")
	public ModelAndView restaurantsHandler1() {
		ModelAndView mav = new ModelAndView("restaurants");
		List<Restaurants> getAllRestaurants = rs.getAllRestaurants();
		System.out.println(getAllRestaurants);

		mav.addObject("restList", getAllRestaurants);
		return mav;
	}
	
	@RequestMapping(value="/addRestaurants", method=RequestMethod.POST)
	public ModelAndView destinationsHandler2(@ModelAttribute("restaurants") Restaurants restaurants) {
		rs.addRestaurants(restaurants);
		List<Restaurants> getAllRestaurants = rs.getAllRestaurants();
		System.out.println(getAllRestaurants);
		ModelAndView mav = new ModelAndView("restaurants");
		mav.addObject("restList", getAllRestaurants);
		System.out.println("reaching restaurants");
		return mav;

}
	@RequestMapping(value="/editRest{rId}", method=RequestMethod.GET)
	public ModelAndView EditRestForm(@PathVariable("rId") Integer rId) {
		List<Restaurants> getAllRestaurants = rs.getAllRestaurants();
		ModelAndView mav = new ModelAndView("editDestination");
		Restaurants newRest= rs.getRestaurants(rId);
		mav.addObject("restList", getAllRestaurants);
		mav.addObject("restaurants", newRest);
		return mav;
}
	
	@RequestMapping(value="/editRestaurants", method=RequestMethod.POST)
	
	public ModelAndView RestForm(@ModelAttribute("restaurants") Restaurants restaurants) {
		rs.updateRestaurants(restaurants.getrId(), restaurants);
		List<Restaurants> getAllRestaurants = rs.getAllRestaurants();
		ModelAndView mav = new ModelAndView("restaurants");
		mav.addObject("restList", getAllRestaurants);
		return mav;
}
	@RequestMapping(value="/deleteRest{rId}", method=RequestMethod.GET)
	public ModelAndView DeleteRestaurants(@PathVariable("rId") Integer rId) {
		rs.deleteRestById(rId);
		List<Restaurants> getAllRestaurants = rs.getAllRestaurants();
		ModelAndView mav = new ModelAndView("restaurants");
		mav.addObject("restList", getAllRestaurants);
		return mav;
}
	
}
