package com.ruzaik.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruzaik.springboot.model.Employee;
import com.ruzaik.springboot.model.Telephone;
import com.ruzaik.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee employee) {
		
		for(Telephone telephone : employee.getTelephonesList()) {
			telephone.setEmployee(employee);
		}
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findall() {
		return employeeRepository.findAll();
	}

	
}