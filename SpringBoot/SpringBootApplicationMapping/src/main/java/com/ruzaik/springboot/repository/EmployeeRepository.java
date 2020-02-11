package com.ruzaik.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruzaik.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}