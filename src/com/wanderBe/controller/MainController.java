package com.wanderBe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.wanderBe.service.UserService;

@Controller
	public class MainController {

		@Autowired
		UserService us;


		@RequestMapping("/")
		public ModelAndView mainHandler() {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
		
		@RequestMapping("/restaurants")
		public ModelAndView restaurantsHandler() {
			ModelAndView mav = new ModelAndView("restaurants");
			return mav;
		}
		
		@RequestMapping("/resources")
		public ModelAndView resourcesHandler() {
			ModelAndView mav = new ModelAndView("resources");
			return mav;
		}
	

//		@RequestMapping(value="/index", method=RequestMethod.GET)
//		public ModelAndView indexHandler(HttpServletRequest request) {
//			ModelAndView mav = new ModelAndView("index");
//			User u = (User)request.getAttribute("user");
//			mav.addObject("user", u);
//			return mav;
//		}

		
		
	}

