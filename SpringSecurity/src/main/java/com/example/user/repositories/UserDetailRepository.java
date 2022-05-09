package com.example.user.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.UserDetails;

@Repository
public interface UserDetailRepository extends CrudRepository<UserDetails, Integer> {

	public Optional<UserDetails> findUserByName(String name); 
	}


