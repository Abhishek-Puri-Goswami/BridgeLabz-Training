package com.dbmsjdbc.jdbc.simplecrud;

import java.sql.*;

public class EmployeeDAO {

	// CREATE TABLE
	public void createTableEmployee() {
	    String dropSql = "DROP TABLE IF EXISTS employee";
	    String createSql = "CREATE TABLE employee ("
		    + "employee_id INT PRIMARY KEY AUTO_INCREMENT,"
		    + "name VARCHAR(50) NOT NULL,"
		    + "salary DECIMAL(10,2) NOT NULL,"
		    + "department VARCHAR(40)"
		    + ")";

	    try (Connection conn = DBConnection.getConnection(); 
		    Statement stmt = conn.createStatement()) {

		stmt.execute(dropSql);
		stmt.execute(createSql);
		System.out.println("Employee table recreated successfully");

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}

	// INSERT EMPLOYEE
	public void addEmployee(String name, double salary, String department) {
	    String sql = "INSERT INTO employee(name,salary,department) VALUES(?,?,?)";

	    try (Connection conn = DBConnection.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql)) {

		ps.setString(1, name);
		ps.setDouble(2, salary);
		ps.setString(3, department);
		
		ps.executeUpdate();
		System.out.println("Employee Added Successfully");

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}

	// VIEW ALL EMPLOYEES
	public void viewEmployees() {
	    String sql = "SELECT * FROM employee";

	    try (Connection conn = DBConnection.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql);
		    ResultSet rs = ps.executeQuery()) {

		System.out.printf("%-5s %-20s %-10s %-15s%n", "ID", "Name", "Salary", "Department");
		while (rs.next()) {

		    System.out.printf("%-5d %-20s %-10.2f %-15s%n", 
			    rs.getInt("employee_id"), 
			    rs.getString("name"), 
			    rs.getDouble("salary"), 
			    rs.getString("department"));
		}

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}

	// UPDATE SALARY OF EMPLOYEE
	public void updateSalary(String name, double newSalary) {
	    String sql = "UPDATE employee SET salary=? WHERE name=?";

	    try (Connection conn = DBConnection.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setDouble(1, newSalary);
		ps.setString(2, name);
		int rows = ps.executeUpdate();

		if (rows > 0) {
		    System.out.println("Salary Updated");
		} else {
		    System.out.println("Employee Not Found");
		}

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}

	// DELETE EMPLOYEE
	public void deleteEmployee(String name) {
	    String sql = "DELETE FROM employee WHERE name=?";

	    try (Connection conn = DBConnection.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql)) {

		ps.setString(1, name);
		int rows = ps.executeUpdate();

		if (rows > 0) {
		    System.out.println("Employee Deleted");
		} else {
		    System.out.println("Employee Not Found");
		}

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}

	// SEARCH EMPLOYEE BY ID
	public void searchEmployee(String keyword) {
	    String sql = "SELECT * FROM employee WHERE name LIKE ?";

	    try (Connection conn = DBConnection.getConnection();
		    PreparedStatement ps = conn.prepareStatement(sql)) {

		ps.setString(1, "%" + keyword + "%");
		ResultSet rs = ps.executeQuery();
		System.out.printf("%-5s %-20s %-10s %-15s%n", "ID", "Name", "Salary", "Department");

		while (rs.next()) {

		    System.out.printf("%-5d %-20s %-10.2f %-15s%n", 
			    rs.getInt("employee_id"), 
			    rs.getString("name"),
			    rs.getDouble("salary"), 
			    rs.getString("department"));
		}

	    } catch (SQLException e) {
		e.printStackTrace();
	    }
	}
}
