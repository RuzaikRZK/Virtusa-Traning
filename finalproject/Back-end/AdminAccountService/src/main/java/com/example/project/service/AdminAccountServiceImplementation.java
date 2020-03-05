package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.AdminContact;
import com.example.project.model.AdminDetailes;
import com.example.project.repository.AdminAccountRepository;

@Service
public class AdminAccountServiceImplementation implements AdminSignupService {

	@Autowired
	AdminAccountRepository adminAccountRepository;

	@Override
	public AdminDetailes SaveDetailes(AdminDetailes Admindetailes) {

		for (AdminContact adminContact : Admindetailes.getContactList()) {

			adminContact.setAdminDetailes(Admindetailes);

		}
		return adminAccountRepository.save(Admindetailes);

	}

}
