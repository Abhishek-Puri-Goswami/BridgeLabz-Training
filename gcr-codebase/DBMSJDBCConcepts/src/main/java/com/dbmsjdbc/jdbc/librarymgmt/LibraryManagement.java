package com.dbmsjdbc.jdbc.librarymgmt;

import java.sql.Date;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	LibraryDAO dao = new LibraryDAO();

	dao.recreateTables();
	int choice;

	do {
	    System.out.println("\n========== Library System ==========");
	    System.out.println("1 -> View All Books");
	    System.out.println("2 -> View All Students");
	    System.out.println("3 -> View Borrow Records");
	    System.out.println("4 -> Borrow Book");
	    System.out.println("5 -> Calculate Fine");
	    System.out.println("6 -> Search (Genre + Author)");
	    System.out.println("7 -> Available Books");
	    System.out.println("0 -> Exit");

	    System.out.print("Enter Choice: ");
	    choice = input.nextInt();
	    input.nextLine();

	    switch (choice) {

	    case 1:
		dao.printAllBooks();
		break;

	    case 2:
		dao.printAllStudents();
		break;

	    case 3:
		dao.printBorrowRecords();
		break;

	    case 4:
		System.out.print("Student ID: ");
		int sid = input.nextInt();

		System.out.print("Book ID: ");
		int bid = input.nextInt();
		input.nextLine();

		System.out.print("Borrow Date (yyyy-mm-dd): ");
		Date bdate = Date.valueOf(input.nextLine());

		System.out.print("Return Date (yyyy-mm-dd): ");
		Date rdate = Date.valueOf(input.nextLine());

		dao.borrowBook(sid, bid, bdate, rdate);
		break;

	    case 5:
		System.out.print("Borrow ID: ");
		int id = input.nextInt();
		dao.calculateFine(id);
		break;

	    case 6:
		System.out.print("Genre: ");
		String genre = input.nextLine();

		System.out.print("Author Keyword: ");
		String author = input.nextLine();

		dao.searchBooks(genre, author);
		break;

	    case 7:
		dao.searchAvailableBooks();
		break;

	    case 0:
		System.out.println("Exiting...");
		break;
	    }

	} while (choice != 0);

	input.close();
    }
}
