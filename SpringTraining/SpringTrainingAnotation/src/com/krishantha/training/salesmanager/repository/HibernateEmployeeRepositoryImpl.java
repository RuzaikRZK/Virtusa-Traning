package com.krishantha.training.salesmanager.repository;
import com.krishantha.training.salesmanager.model.Employee;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;


@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	
	@Override
	public java.util.List<Employee> getAllEmployees(){
		
		java.util.List<Employee> employees = new ArrayList<>();
		
		Employee e = new Employee();
		e.setEmployeeLocation("kurunegala");
		e.setEmployeeName("ruzaik");
		employees.add(e);
		
		return employees;
	} 

}
