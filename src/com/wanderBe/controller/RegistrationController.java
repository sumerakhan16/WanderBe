package com.wanderBe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wanderBe.entities.User;
import com.wanderBe.repo.UserRepository;
import com.wanderBe.service.UserService;


@Controller
public class RegistrationController {

	@Autowired
	UserService us;
	
	@Autowired
	UserRepository ur;
	
	//access to register
//	@RequestMapping("/register")
//	public ModelAndView registerHandler() {
//		ModelAndView mav = new ModelAndView("register");
//		return mav;
//	}

	//add user to database
	@RequestMapping(value="registerSubmit", method=RequestMethod.POST)
	public String registerUserHandler(@ModelAttribute("user") User user) {
		//ModelAndView mav = new ModelAndView("register");
		us.addUser(user);
		return "destinations";
		

}
}
	
	
