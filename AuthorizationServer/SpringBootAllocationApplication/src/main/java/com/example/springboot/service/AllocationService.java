package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.Allocation;

public interface AllocationService {
	
	List<Allocation> findByID(Integer employeeID);
	
	Allocation save(Allocation allocation);
}