package com.dbmsjdbc.jdbc.simplecrud;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	EmployeeDAO dao = new EmployeeDAO();

	dao.createTableEmployee();

	int choice;
	do {
	    System.out.println("\n========== Employee System ==========");
	    System.out.println("1 -> Add Employee");
	    System.out.println("2 -> View Employees");
	    System.out.println("3 -> Update Salary");
	    System.out.println("4 -> Delete Employee");
	    System.out.println("5 -> Search Employee");
	    System.out.println("0 -> Exit");

	    System.out.print("Enter Choice: ");
	    choice = input.nextInt();
	    input.nextLine();

	    switch (choice) {
	    	case 1:
	    	    System.out.print("Name: ");
		    String name = input.nextLine();

		    System.out.print("Salary: ");
		    double salary = input.nextDouble();
		    input.nextLine();

		    System.out.print("Department: ");
		    String dept = input.nextLine();

		    dao.addEmployee(name, salary, dept);
		    break;

		case 2:
		    dao.viewEmployees();
		    break;

		case 3:
		    System.out.print("Name: ");
		    String uname = input.nextLine();

		    System.out.print("New Salary: ");
		    double newSal = input.nextDouble();

		    dao.updateSalary(uname, newSal);
		    break;

		case 4:
		    System.out.print("Name: ");
		    String dname = input.nextLine();

		    dao.deleteEmployee(dname);
		    break;

		case 5:
		    System.out.print("Search By Name Keyword: ");
		    String key = input.nextLine();

		    dao.searchEmployee(key);
		    break;
			
		case 0:
		    System.out.println("Exiting...");
		    break;

		default:
		    System.out.println("Invalid Choice");
	    }

	} while (choice != 0);

	input.close();
    }
}
