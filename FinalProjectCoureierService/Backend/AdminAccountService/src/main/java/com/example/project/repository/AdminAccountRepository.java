package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.project.model.UserDetailes;

public interface AdminAccountRepository extends JpaRepository<UserDetailes, Integer> {
	
	//if we add to repository because we dont have inbuild methods , hand made method 
	
	UserDetailes findByUsername(String username);
}