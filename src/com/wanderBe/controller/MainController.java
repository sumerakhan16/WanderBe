package com.wanderBe.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.wanderBe.service.UserService;

@Controller
	public class MainController {

		@Autowired
		UserService us;

		//landing page
		@RequestMapping("/")
		public ModelAndView mainHandler() {
			ModelAndView mav = new ModelAndView("index");
			return mav;
		}
		
		//restaurants page (future implementation)
//		@RequestMapping("/restaurants")
//		public ModelAndView restaurantsHandler() {
//			ModelAndView mav = new ModelAndView("restaurants");
//			return mav;
//		}
		
		//access to resources page
		@RequestMapping("/resources")
		public ModelAndView resourcesHandler() {
			ModelAndView mav = new ModelAndView("resources");
			return mav;
		}
	

		@RequestMapping(value="/logout", method = RequestMethod.GET)
		public ModelAndView logout(HttpServletRequest request) {
			ModelAndView mav = new ModelAndView("logout");
			request.setAttribute("user", null);
			HttpSession httpSession = request.getSession();
			httpSession.invalidate();
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

