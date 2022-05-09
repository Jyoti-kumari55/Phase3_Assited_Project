package com.example.authentication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.authentication.entity.User;
import com.example.authentication.exception.UserNotFoundException;
import com.example.authentication.services.UserService;

@Controller
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String showGreeting() {
		return "wish";
	}
	@GetMapping("/Auth")
	public String showLogin() {
		return "authen";
	}
	@PostMapping("/Auth")
	public String authenticateUser(@RequestParam("username") String username, @RequestParam("password") String pswd) throws UserNotFoundException {
		User user = service.GetUserByName(username);
		logger.info(user.getName() + " attempted to login with " + user.getPassword());
	String path = (service.isValidPassword(pswd, user.getPassword())) ? "success" : "failure";
		logger.info("The path return: " + path);
		return path;
	}  

}
