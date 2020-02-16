package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.model.Allocation;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
	
}