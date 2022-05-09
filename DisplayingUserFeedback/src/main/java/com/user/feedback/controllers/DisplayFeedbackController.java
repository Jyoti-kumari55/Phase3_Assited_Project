package com.user.feedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.feedback.entity.UserFeedback;
import com.user.feedback.services.UserFeedbackServices;

public class DisplayFeedbackController {

	@Autowired
	UserFeedbackServices service;
	
	@GetMapping("/test_form")
	public String showTestForm(ModelMap model) {
		model.addAttribute("test", new UserFeedback());
		return "testformjsp";
	}
	
	
	@PostMapping("/test_form")
	public String submitTestForm(@ModelAttribute("testUser") UserFeedback feed, ModelMap m) {
		service.addNewUserFeedback(feed);
		m.addAttribute("test", feed);
			return "post";
	}
}
