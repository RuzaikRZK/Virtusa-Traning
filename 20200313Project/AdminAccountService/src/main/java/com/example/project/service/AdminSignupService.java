package com.example.project.service;

import com.example.project.model.APIResponse;

import com.example.project.model.UserDetailes;

public interface AdminSignupService {
	
	UserDetailes SaveDetailes(UserDetailes userDetailes);
	
	APIResponse adminLogin(String username, String password);
}
