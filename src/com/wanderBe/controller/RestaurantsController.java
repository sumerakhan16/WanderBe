package com.wanderBe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
		mav.addObject("restList", getAllRestaurants);
		return mav;
	}
	
	@RequestMapping(value="/restaurants", method=RequestMethod.POST)
	public String restaurantsHandler2(@ModelAttribute("restaurants") Restaurants restaurants) {
		rs.addRestaurants(restaurants);
		System.out.println("reaching restaurants");
		return "restaurants";
		
	}
}
