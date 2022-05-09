package com.user.feedback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.feedback.entity.UserFeedback;

@Repository
public interface UserFeedbackRepository extends JpaRepository<UserFeedback, Integer>{

	public UserFeedback findByUser(String feedback);
}
