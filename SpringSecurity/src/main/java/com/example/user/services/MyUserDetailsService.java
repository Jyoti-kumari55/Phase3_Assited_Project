package com.example.user.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.user.entity.MyUserDetails;
import com.example.user.repositories.UserDetailRepository;

@Service
public class MyUserDetailsService extends UserDetailsService {

	@Autowired
	UserDetailRepository userRepo;
	public com.example.user.entity.UserDetails GetUserByName(String name) {
		Optional<com.example.user.entity.UserDetails> user = userRepo.findUserByName(name);
		if(!user.isPresent()) throw new RuntimeException();
		return user.get();
	}

public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return new MyUserDetails();
	}

}
