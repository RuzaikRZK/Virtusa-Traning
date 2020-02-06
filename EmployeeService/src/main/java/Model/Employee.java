package Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static List<Employee> getAllEmployee() {

		Employee e = new Employee();
		List<Employee> employee = new ArrayList<>();
		e.setName("ruzaik");
		e.setAge("22");
		employee.add(e);

		return employee;

	}

}
