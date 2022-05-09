package com.example.authentication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.authentication.entity.User;
import com.example.authentication.exception.UserNotFoundException;
import com.example.authentication.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	public User GetUserByName(String name) throws UserNotFoundException {
		Optional<User> found = repo.findUserByName(name);
		if(found.isPresent()) return found.get();
		else throw new UserNotFoundException();
	}
public Boolean isValidPassword(String cmp, String actual) {
return ((cmp.equals(actual)) ?  true :  false);	
}

}
