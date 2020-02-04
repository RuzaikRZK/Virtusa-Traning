package com.krishantha.training.salesmanager.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	// EmployeeRepository employeeRepository = new
	// HibernateEmployeeRepositoryImpl();

	
	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		System.out.println("Overload Constarucot Executed !");
		this.employeeRepository = employeeRepository;

	}

	public EmployeeServiceImpl() {

		System.out.println("default Constarucot Executed !");
		
	}

	public EmployeeRepository getEmployeeRepository() {

		return employeeRepository;

	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {

		System.out.println("Setter Executed !");
		this.employeeRepository = employeeRepository;

	}

	@Override
	public java.util.List<Employee> getAllEmployees() {

		return employeeRepository.getAllEmployees();

	}

}
