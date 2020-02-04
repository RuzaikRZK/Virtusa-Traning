package com.krishantha.training.salesmanager.service;

import java.awt.List;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	// EmployeeRepository employeeRepository = new
	// HibernateEmployeeRepositoryImpl();

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;

	}

	public EmployeeRepository getEmployeeRepository() {

		return employeeRepository;

	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;

	}

	@Override
	public java.util.List<Employee> getAllEmployees() {

		return employeeRepository.getAllEmployees();

	}

}
