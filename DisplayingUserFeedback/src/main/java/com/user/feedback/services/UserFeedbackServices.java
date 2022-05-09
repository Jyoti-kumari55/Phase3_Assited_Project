package com.user.feedback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.feedback.entity.UserFeedback;
import com.user.feedback.repositories.UserFeedbackRepository;

@Service
public class UserFeedbackServices {
	
	@Autowired
	UserFeedbackRepository feedRepo;
	
	public List<UserFeedback> getAllUserFeedback() {
		return feedRepo.findAll();
	}
	
	public UserFeedback addNewUserFeedback(UserFeedback feed) {
		return feedRepo.save(feed);
	}

}
