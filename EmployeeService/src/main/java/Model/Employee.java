package Model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static List<Employee> getAllEmployee() {

		Employee e = new Employee("ruzaik",23);
		List<Employee> employee = new ArrayList<>();
		//e.setName("ruzaik");
		//e.setAge(22);
		employee.add(e);

		return employee;

	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
