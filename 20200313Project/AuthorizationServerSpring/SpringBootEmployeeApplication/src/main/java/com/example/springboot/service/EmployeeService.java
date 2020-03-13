package com.example.springboot.service;

import java.util.Optional;

import com.example.springboot.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	
	Optional<Employee> findByID(int employeeID);
	
	Employee fetchAllFromEmployee(int employeeID);
}