package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.AdminDetailes;
import com.example.project.service.AdminSignupService;

@CrossOrigin(origins = "http://localhost:4300")
@RestController
@RequestMapping("/AdminSignup")
public class AdminSignupController {

	@Autowired 
	AdminSignupService adminSignupService; 
	
	@RequestMapping(value = "/getAllAdminDetailes")
	public List<AdminDetailes> getAllAdmin() {

		return AdminDetailes.getAllEmployees();

	}
	
	
	@RequestMapping(value = "/SaveAdminDetailes", method = RequestMethod.POST)
	public AdminDetailes Save(@RequestBody AdminDetailes adminDetailes) {
		
		return adminSignupService.SaveDetailes(adminDetailes);
		
		
	}

}
