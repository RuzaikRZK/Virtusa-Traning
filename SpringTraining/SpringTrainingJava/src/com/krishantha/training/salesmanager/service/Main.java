package com.krishantha.training.salesmanager.service;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.training.salesmanager.config.ApplicationConfiguration;
import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.*;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;


public class Main {
	
	public static void main(String [] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		EmployeeService employeeService = applicationContext.getBean("emmployeeService",EmployeeService.class);
		
	List<Employee> employees = employeeService.getAllEmployees();
		
		for(Employee employee : employees) {
			
			System.out.println(employee.getEmployeeName() +" at " +employee.getEmployeeLocation());
			
		}
		
		
		
	}

}
