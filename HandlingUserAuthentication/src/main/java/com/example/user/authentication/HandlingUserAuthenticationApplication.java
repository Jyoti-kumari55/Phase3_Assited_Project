package com.example.user.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.authentication.controller.UserController;
import com.example.authentication.entity.User;
import com.example.authentication.exception.UserNotFoundException;
import com.example.authentication.services.UserService;

@SpringBootApplication

@Import({
      UserController.class,
      UserNotFoundException.class,
      UserService.class,
      User.class
})

public class HandlingUserAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandlingUserAuthenticationApplication.class, args);
	}

}
