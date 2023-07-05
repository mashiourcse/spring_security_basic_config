package com.codemash.controllers;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codemash.entities.User;
import com.codemash.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private UserService userService;
	
	 @RequestMapping("/test")
	    public String test() {
	        this.logger.warn("This is working message");
	        return "Testing message";
	    }
	 
	 @RequestMapping("/user")
	 public List<User> getUser() {
		 
		 System.out.println("getting users");
		 return userService.getUsers();
	 }
	 
	 @RequestMapping("/loggedInUser")
	 public String getLoggedInUser( Principal principal) {
		 return principal.getName();
	 }

}
