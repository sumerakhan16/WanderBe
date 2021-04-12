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
public class UserController {

	@Autowired
	UserService us;

	//access to login/register page
	@RequestMapping("/login")
	    public ModelAndView loginHandler() {
	        ModelAndView mav = new ModelAndView("login");    
	        return mav;
	}

	//get user from database using request parameters
	@RequestMapping(value = "loginProcess", method = RequestMethod.GET)
	public ModelAndView loginPageHandler(@RequestParam("uName") String uName, @RequestParam("uPass") String uPass, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		System.out.println(us.validateUser(uName, uPass));
		if (us.validateUser(uName, uPass) != null) {
			User newUser = us.getUser(uName);
			request.getSession().setAttribute("user", newUser);
			mav.addObject(newUser);
			mav.setViewName("destinations");
		} else {
			request.setAttribute("message",  "Unable to login, Please enter Correct Username and Password");
			mav.setViewName("login");
		}
			
		return mav;
	}
}
