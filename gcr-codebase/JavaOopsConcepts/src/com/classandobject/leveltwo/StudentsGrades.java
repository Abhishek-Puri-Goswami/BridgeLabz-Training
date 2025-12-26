package com.classandobject.leveltwo;

public class StudentsGrades {

	// instance variables
	String name;
	String rollNumber;
	double[] marks;

	// creating constructor
	StudentsGrades(String name, String rollNumber, double[] marks) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	// method to calculate grade
	public String calculateGrade() {
		double total = calculateAverage();

		if (total >= 80)
			return "Grade A";
		else if (total >= 60)
			return "Grade B";
		else if (total >= 50)
			return "Grade C";
		else if (total >= 40)
			return "Grade D";
		else
			return "Grade F";
	}

	// method to calculate average marks
	public double calculateAverage() {
		double sum = 0;
		for (double m : marks) {
			sum += m;
		}
		return sum / marks.length;
	}

	// method to display student details
	public void displayStudent() {
		System.out.println("Student Name: " + name);
		System.out.println("Student RollNumber: " + rollNumber);

		for (int i = 0; i < marks.length; i++) {
			System.out.println("Mark" + (i + 1) + ": " + marks[i]);
		}
		System.out.println(calculateGrade());
		System.out.println("---------------");
	}

	public static void main(String[] args) {

		// creating objects
		StudentsGrades student1 = new StudentsGrades("Thamarai", "ECE001", new double[] { 80, 70, 75 });
		StudentsGrades student2 = new StudentsGrades("Kannan", "CSC002", new double[] { 60, 65, 50 });

		// calling display method
		student1.displayStudent();
		student2.displayStudent();
	}
}
