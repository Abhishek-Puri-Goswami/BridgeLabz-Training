package com.encapsulation.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {

    private String department;

    // Constructor to initialize full-time employee
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    // Fixed salary calculation
    @Override
    public double calculateSalary() {
        return getBaseSalary();
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
