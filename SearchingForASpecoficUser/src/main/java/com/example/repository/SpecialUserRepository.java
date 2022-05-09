package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.user.SpecialUser;

public interface SpecialUserRepository extends JpaRepository<SpecialUser, Integer> {

	SpecialUser findByName(String name);

	
}
