package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.AdminDetailes;

public interface AdminAccountRepository extends JpaRepository<AdminDetailes, Integer> {
	
	AdminDetailes findByAdminName(String username);
}