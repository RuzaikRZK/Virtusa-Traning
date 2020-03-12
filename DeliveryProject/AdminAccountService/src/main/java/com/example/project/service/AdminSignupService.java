package com.example.project.service;

import com.example.project.model.APIResponse;
import com.example.project.model.AdminDetailes;

public interface AdminSignupService {
	
	AdminDetailes SaveDetailes(AdminDetailes Admindetailes);
	
	APIResponse adminLogin(String username, String password);
}
