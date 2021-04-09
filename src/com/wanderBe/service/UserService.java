package com.wanderBe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wanderBe.entities.User;
import com.wanderBe.repo.UserRepository;

@Service
public class UserService{

	@Autowired
	UserRepository ur;
		
	@Autowired
	UserService us;
		
		public User addUser(User user) {
			return ur.save(user);
		}		
		
		public User getUser(String uName) {
			return ur.getByuName(uName);
		}
		
		public List<User> getAllUsers(){
			return ur.findAll();
		}
			
		public User validateUser(String uName, String uPass) {
			User user = ur.getByuName(uName);
			if (user!= null) {
				if(user.getuPass().equals(uPass)) {
					return user;
				}
			}
			return null;
		}
		
		
		
	}
