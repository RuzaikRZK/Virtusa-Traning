package com.example.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.model.Allocation;
import com.example.springboot.model.Employee;
import com.example.springboot.model.Telephone;
import com.example.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Override
	public Employee save(Employee employee) {

		for (Telephone telephone : employee.getTelephonesList()) {
			telephone.setEmployee(employee);
		}

		return employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> findByID(int employeeID) {
		return employeeRepository.findById(employeeID);
	}

	@Override
	public Employee fetchAllFromEmployee(int employeeID) {
		Optional<Employee> employeeOptional = employeeRepository.findById(employeeID);

		if (employeeOptional.isPresent()) {
			Employee employee = employeeOptional.get();

			HttpHeaders httpHeaders = new HttpHeaders();
			HttpEntity<String> httpEntity = new HttpEntity<String>("", httpHeaders);

			ResponseEntity<Allocation[]> responseEntity = restTemplate.exchange(
					"http://localhost:8596/allocation/find/" + employeeID, HttpMethod.GET, httpEntity,
					Allocation[].class);

			employee.setAllocations(responseEntity.getBody());

			return employee;
		}

		return null;
	}
}