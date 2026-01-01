package com.encapsulation.employeemanagementsystem;

import java.util.ArrayList;

public class EmployeeManagementSystem {

	public static void main(String[] args) {

		// Polymorphism: Employee reference holding different employee types
		ArrayList<Employee> employees = new ArrayList<>();

		Employee emp1 = new FullTimeEmployee(101, "Divyansh", 6_00_000);
		Employee emp2 = new PartTimeEmployee(102, "Disha", 1000, 12);

		((Department) emp1).assignDepartment("CSE");
		((Department) emp2).assignDepartment("ECE");

		employees.add(emp1);
		employees.add(emp2);

		// Displayed all employees using Employee reference
		for (Employee employee : employees) {
			employee.displayDetails();
			System.out.println("Department : " + ((Department) employee).getDepartmentDetails());
			System.out.println("------------------------");
		}
	}
}
