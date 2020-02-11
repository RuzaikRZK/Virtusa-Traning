package Controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Employee;

@RestController
@RequestMapping("/service")
public class EmployeeController {
	@RequestMapping("/hello")
	public String getString() {

		return "<h1>Heelo From String</h1>&nbsp <h1>test</h1>";

	}

	@RequestMapping(value = "/empdetailes")
	public List<Employee> getEmployee() {

		return Employee.getAllEmployee();
	}

	// URL Path Parameter Int Data type
	// http://localhost:8192/service/EmployeeAge/22

	@RequestMapping("EmployeeAge/{age}")

	public int getEmployeeAge(@PathVariable int age) {

		Employee e = new Employee("ruzaik", 34);

		if (age == 22) {

			return e.getAge();

		} else {
			JOptionPane.showMessageDialog(null, "test");
			return 0;

		}

	}

	// URL Path Parameter String Data type
	// http://localhost:8192/service/EmployeeAge2/ruzaik

	@RequestMapping("EmployeeAge2/{name}")
	@ResponseBody
	public Employee GetEmployeeAge2(@PathVariable String name) {

		if (name.equals("ruzaik")) {

			return new Employee("ruzaik", 28);

		}
		return null;

	}

	// query Parameter URL
	//http://localhost:8192/service/EmployeeAge3?age=11
	
	@RequestMapping("EmployeeAge3")
	
	public int GetAgeByQuery(@RequestParam int age ) {
		//Employee e =new Employee("ruzaik",11);
		return age;
		
	}

}
