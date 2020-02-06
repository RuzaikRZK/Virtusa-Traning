package Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Model.Employee;

@RestController
@RequestMapping("/service")
public class EmployeeController {
	@RequestMapping("/hello")
	public String getString() {

		return "<h1>Heelo From String</h1>&nbsp <h1>test</h1>";

	}

	@RequestMapping(value="/empdetailes")
	public List<Employee> getEmployee() {

		return Employee.getAllEmployee();
	}

}
