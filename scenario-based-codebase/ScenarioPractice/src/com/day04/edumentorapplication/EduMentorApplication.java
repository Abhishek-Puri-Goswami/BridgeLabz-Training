/*
10. "EduMentor – Personalized Learning Platform"
Story: EduMentor is an AI-based learning platform. You're tasked with implementing the module
to manage courses, quizzes, and learner progress.

Requirements:
● User base class: name, email, userId.
● Learner and Instructor inherit from User.
● ICertifiable interface with method generateCertificate().
● Quiz class: fields for questions, answers, and score.
● Use constructors to create quizzes with variable difficulty.
● Encapsulation for quiz answers (can’t be modified once set).
● Use operators to score the quiz and generate a percentage.
● Polymorphism: generateCertificate() works differently for short courses vs
full-time.
● Apply access modifiers: internal question banks must remain private.
*/

package com.day04.edumentorapplication;

import java.util.Scanner;

public class EduMentorApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Learner ID: ");
		int id = input.nextInt();
		input.nextLine();

		System.out.print("Enter Name: ");
		String name = input.nextLine();

		System.out.print("Enter Email: ");
		String email = input.nextLine();

		System.out.print("Enter Course Type (Short/Full): ");
		String courseType = input.nextLine();

		Learner learner = new Learner(id, name, email, courseType);

		System.out.print("\nSelect Quiz Difficulty (Easy/Hard): ");
		String difficulty = input.nextLine();

		Quiz quiz = new Quiz(difficulty);

		System.out.println("\n------ Quiz Questions ------");
		quiz.printQuestions();

		char[] answers = new char[quiz.getTotalMarks() / 10];

		// Loop collects answers for each question
		for (int i = 0; i < answers.length; i++) {
			System.out.print("Enter answer for Q" + (i + 1) + ": ");
			answers[i] = input.next().charAt(0);
		}

		quiz.attemptQuiz(answers);

		int score = quiz.getScore();
		int total = quiz.getTotalMarks();
		double percentage = (score * 100.0) / total;

		learner.printDetails();

		System.out.println("\n------ Quiz Result ------");
		System.out.printf("%-20s : %d%n", "Score", score);
		System.out.printf("%-20s : %d%n", "Total Marks", total);
		System.out.printf("%-20s : %.2f%%%n", "Percentage", percentage);

		learner.generateCertificate(percentage);
		input.close();
	}
}
