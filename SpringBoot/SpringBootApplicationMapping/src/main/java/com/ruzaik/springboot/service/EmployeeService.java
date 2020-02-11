package com.ruzaik.springboot.service;

import java.util.List;

import com.ruzaik.springboot.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee employee);
	List<Employee> findall();
	
}