package com.user.feedback.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.user.feedback.entity.UserFeedback;
import com.user.feedback.services.UserFeedbackServices;

@Controller
public class UserFeedbackControllers {

	@Autowired
	UserFeedbackServices service;
	
	@GetMapping("/feedback")
	public List<UserFeedback> getAllFeedbacks(){
		return service.getAllUserFeedback();
	}
	
	@PostMapping(path="/feedback", consumes= {MediaType.APPLICATION_JSON_VALUE}) 
	public UserFeedback addNewFeedback(@RequestBody UserFeedback feed) {
		UserFeedback newFb = new UserFeedback(feed.getComments(), feed.getRating(), feed.getUser());
		service.addNewUserFeedback(newFb);
		return newFb;
	}
}
