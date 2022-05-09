package com.example.controllers;

import java.util.List;

import org.hibernate.boot.model.relational.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.services.SpecialUserService;
import com.example.user.SpecialUser;

@Controller
public class SpecialUserController {

	@Autowired
	private SpecialUserService service;
	
	Logger logger = LoggerFactory.getLogger(SpecialUserController.class);
	
	@GetMapping("specialUsers")
	public String showSpecialUsers(ModelMap model) {
		logger.info("Getting All Special Users");
		List<SpecialUser> su = service.getAllSpecialUsers();
		logger.info("Passing users to view");
		model.addAttribute("SpecialUsers", su );
		return "specialUsers";
	}
	@RequestMapping(value ="/search/{id}", method = RequestMethod.POST)
	public String searchUser(ModelMap model, @RequestParam("id") int id) {
		logger.info("Searching for a user");
		SpecialUser su = service.getSpecialUserById(id);
		logger.info("Passing Searched User to View");
		model.addAttribute("searchSpecialUser", su);
		return "search";
	}
	@PostMapping("search/update")
	public String updateUser(ModelMap model, @ModelAttribute("update") SpecialUser su) {
		logger.info("Updating A Special User");
		service.updateSpecialUser(su);
		model.addAttribute("updatedSpecialUser", su);
		return "update";
	}
}
