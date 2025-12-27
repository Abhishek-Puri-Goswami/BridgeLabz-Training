package com.constructors.levelone;

public class Manager extends Employee {

	// constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Demonstrates access to public and protected members
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    // main - driver method
    public static void main(String[] args) {
        Manager manager = new Manager(501, "IT", 75000);

        manager.displayManagerDetails();

        manager.setSalary(85000);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}

