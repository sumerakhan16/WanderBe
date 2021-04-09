package com.wanderBe.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.User;
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

		@RequestMapping("/login")
		public ModelAndView loginHandler2() {
			return new ModelAndView("login");
		}
		
	

		@RequestMapping(value="/index", method=RequestMethod.GET)
		public ModelAndView indexHandler(HttpServletRequest request) {
			ModelAndView mav = new ModelAndView("index");
			User u = (User)request.getAttribute("user");
			mav.addObject("user", u);
			return mav;
		}

		@RequestMapping(value = "loginProcess", method = RequestMethod.POST)
		public ModelAndView loginHandlerTesting(@RequestParam("username") String username, @RequestParam("uPass") String uPass, HttpServletRequest request) {
			ModelAndView mav = new ModelAndView();
			if (us.validateUser(username, uPass) != null) {
				User user = us.getUser(username);
				request.getSession().setAttribute("user", user);
				mav.addObject("user", user);
				return indexHandler(request);
			} else {
				request.setAttribute("message", "Unknown username/password. Please try again. Click Create an Account below if this is your first visit :");
				request.getRequestDispatcher("/");
				mav.setViewName("login");
			}

			return mav;
		}
		
//	
		
	}

//	@RequestMapping("/")  // "/" ==> this is the root or home page
//	public String indexHandler() {
//		return "index"; // view file name index.jsp
//}
//	
//	
//	@RequestMapping("/login")  // "/" ==> this is the root or home page
//	public String loginHandler() {
//		return "login"; // view file name index.jsp
//}
