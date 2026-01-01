package com.encapsulation.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

    private int hoursWorked;
    private double hourlyRate;
    private String department;

    // Constructor to initialize part-time employee
    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Salary based on hours worked
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Assign department
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    // getter
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
