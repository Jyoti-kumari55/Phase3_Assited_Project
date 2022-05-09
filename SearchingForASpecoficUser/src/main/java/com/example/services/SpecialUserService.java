package com.example.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.exception.UserNotFoundException;
import com.example.repository.SpecialUserRepository;
import com.example.user.SpecialUser;

@Service 
public class SpecialUserService {

	@Autowired
	private SpecialUserRepository srRepo;
	
	public List<SpecialUser> getAllSpecialUsers() {
		return srRepo.findAll();
	}
	
	public SpecialUser getSpecialUserByName(String name) {
		return srRepo.findByName(name);
		
	}
	
	public SpecialUser getSpecialUserById(Integer id) {
		Optional<SpecialUser> foundUser = srRepo.findById(id);
		if(!foundUser.isPresent()) 
			throw new UserNotFoundException();
		return foundUser.get();
	}
	
	public SpecialUser updateSpecialUser(SpecialUser update) {
		return srRepo.save(update);
	}
}



