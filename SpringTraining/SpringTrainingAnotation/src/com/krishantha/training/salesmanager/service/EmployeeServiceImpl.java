package com.krishantha.training.salesmanager.service;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	// EmployeeRepository employeeRepository = new
	// HibernateEmployeeRepositoryImpl();
	
	
	EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl() {
		
		System.out.print("Default Constructor Executed");
	}

	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		System.out.println("OverLoaded Injection Executed");
		this.employeeRepository = employeeRepository;

	}

	public EmployeeRepository getEmployeeRepository() {

		return employeeRepository;

	}

	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {

		System.out.print("Setter Injection Fired");
		this.employeeRepository = employeeRepository;

	}

	@Override
	public java.util.List<Employee> getAllEmployees() {

		return employeeRepository.getAllEmployees();

	}

}
