package com.example.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.APIResponse;

import com.example.project.model.UserDetailes;
import com.example.project.service.AdminSignupService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/AdminSignup")
public class AdminSignupController {

	@Autowired
	AdminSignupService adminSignupService;

	/*
	@RequestMapping(value = "/getAllAdminDetailes")
	public List<AdminDetailes> getAllAdmin() {

		return AdminDetailes.getAllEmployees();

	}
	*/

	@RequestMapping(value = "/SaveAdminDetailes", method = RequestMethod.POST)
	public UserDetailes Save(@RequestBody UserDetailes UserDetailes) {
		System.err.println(UserDetailes);
		return adminSignupService.SaveDetailes(UserDetailes);

	}

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public void test(@RequestHeader HttpHeaders httpHeaders) {
		System.err.println(httpHeaders);
	}

	@RequestMapping("/employee/id/{employeeID}")
	public Optional<UserDetailes> findByID(@PathVariable int employeeID) {
		return null;
	}
	
	@GetMapping(value = "/login/{username}/{password}")
	public @ResponseBody APIResponse adminLogin(@PathVariable String username, @PathVariable String password) {
		return adminSignupService.adminLogin(username, password);
	}
}