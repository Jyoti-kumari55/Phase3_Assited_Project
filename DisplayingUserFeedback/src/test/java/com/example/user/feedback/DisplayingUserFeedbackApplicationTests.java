package com.example.user.feedback;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.feedback.entity.UserFeedback;
import com.user.feedback.repositories.UserFeedbackRepository;

@SpringBootTest
class DisplayingUserFeedbackApplicationTests {
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	UserFeedbackRepository feedRepo;
	

	
	@Test
	void shouldFindByUser() {
		UserFeedback testFeedback = new UserFeedback("Dummy Test", 5, "dummy");
		entityManager.persist(testFeedback);
		entityManager.flush();
		UserFeedback cmp = feedRepo.findByUser(testFeedback.getUser());
		assertEquals(cmp.getUser(), testFeedback.getUser());
	}

}
