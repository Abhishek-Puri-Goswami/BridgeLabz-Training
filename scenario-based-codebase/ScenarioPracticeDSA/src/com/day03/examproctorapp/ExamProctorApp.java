/*
 11. ExamProctor – Online Exam Review System (Stack + HashMap +
Functions)
Story: 
	● During an online exam, each student’s question navigation is recorded using a Stack (last visited question). 
	● Answers are stored in a HashMap: questionID → answer.
	● A function auto-calculates the score once the student submits.
Requirements:
	● Track navigation with stack.
	● Store answers in a map.
	● Evaluate using functions for scoring logic.
*/

package com.day03.examproctorapp;

import java.util.*;

public class ExamProctorApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Sample questions (MCQ with single correct answer)
		List<ExamQuestion> questions = new ArrayList<>();
		questions.add(new ExamQuestion(101, "What is 7 × 8?", "56"));
		questions.add(new ExamQuestion(102, "Capital of France?", "PARIS"));
		questions.add(new ExamQuestion(103, "Largest planet in solar system?", "JUPITER"));
		questions.add(new ExamQuestion(104, "Java is a ___ language.", "PROGRAMMING"));
		questions.add(new ExamQuestion(105, "1 + 1 = ?", "2"));
		
		System.out.println("===== ExamProctor – Online Exam =====");
		System.out.print("Enter your Student ID: ");
		String studentId = input.nextLine().trim();

		StudentExam exam = new StudentExam(studentId, questions);

		System.out.println("\nTotal questions: " + questions.size());
		System.out.println("Use commands: next, prev, jump <num>, answer <your answer>, summary, submit\n");

		while (true) {
			System.out.print("\nQ" + exam.getCurrentQuestionNumber() + "> ");
			ExamQuestion q = exam.getCurrentQuestion();
			System.out.println(q.getQuestionText());

			String currentAns = exam.getCurrentAnswer();
			if (!currentAns.isEmpty()) {
				System.out.println("   (already answered: " + currentAns + ")");
			}

			System.out.print("Command: ");
			String cmd = input.nextLine().trim().toLowerCase();

			if (cmd.startsWith("answer ")) {
				String answer = cmd.substring(7).trim();
				exam.answerCurrent(answer);
			} else if (cmd.equals("next")) {
				if (!exam.nextQuestion()) {
					System.out.println("-> This is the last question.");
				}
			} else if (cmd.equals("prev")) {
				if (!exam.previousQuestion()) {
					System.out.println("-> No previous question.");
				}
			} else if (cmd.startsWith("jump ")) {
				try {
					int num = Integer.parseInt(cmd.substring(5).trim());
					if (!exam.jumpToQuestion(num)) {
						System.out.println("-> Invalid question number.");
					}
				} catch (NumberFormatException e) {
					System.out.println("-> Invalid jump format. Use: jump 3");
				}
			} else if (cmd.equals("summary")) {
				exam.showSummary();
			} else if (cmd.equals("submit")) {
				int score = exam.calculateScore();
				System.out.println("\n===== EXAM SUBMITTED =====");
				System.out.println("Student: " + studentId);
				System.out.println("Score: " + score + " / " + questions.size());
				System.out.println("Percentage: " + String.format("%.1f", (score * 100.0 / questions.size())) + "%");
				break;
			} else if (cmd.equals("exit")) {
				System.out.println("Exam cancelled.");
				break;
			} else {
				System.out.println("Unknown command. Try: next, prev, jump <num>, answer <text>, summary, submit");
			}
		}

		input.close();
	}
}