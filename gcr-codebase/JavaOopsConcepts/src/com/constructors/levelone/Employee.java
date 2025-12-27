package com.constructors.levelone;

public class Employee {

    // Public
    public int employeeID;

    // Protected
    protected String department;

    // Private
    private double salary;

    // constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Updates salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Returns salary
    public double getSalary() {
        return salary;
    }

    // Displays employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
