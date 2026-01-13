package com.day03.examproctorapp;

import java.util.*;

public class StudentExam {
	private final String studentId;
	private final List<ExamQuestion> questions; // All questions
	private final Map<Integer, String> answers = new HashMap<>(); // QuestionId -> student's answer
	private final Stack<Integer> navigationStack = new Stack<>(); // last visited questions

	private int currentQuestionIndex = 0;

	public StudentExam(String studentId, List<ExamQuestion> questions) {
		this.studentId = studentId;
		this.questions = questions;
		if (!questions.isEmpty()) {
			// start at first question
			navigationStack.push(0);
		}
	}

	// Move to next question
	public boolean nextQuestion() {
		if (currentQuestionIndex < questions.size() - 1) {
			currentQuestionIndex++;
			navigationStack.push(currentQuestionIndex);
			return true;
		}
		return false;
	}

	// Go back to previous question - stack
	public boolean previousQuestion() {
		if (navigationStack.size() > 1) {
			navigationStack.pop(); // remove current
			currentQuestionIndex = navigationStack.peek();
			return true;
		}
		return false;
	}

	// Jump to specific question number (1-based)
	public boolean jumpToQuestion(int questionNumber) {
		if (questionNumber < 1 || questionNumber > questions.size()) {
			return false;
		}
		currentQuestionIndex = questionNumber - 1;
		navigationStack.push(currentQuestionIndex);
		return true;
	}

	// Answer current question
	public void answerCurrent(String answer) {
		if (currentQuestionIndex >= 0 && currentQuestionIndex < questions.size()) {
			int qid = questions.get(currentQuestionIndex).getId();
			answers.put(qid, answer.trim().toUpperCase());
			System.out.println("Answer saved for Q" + (currentQuestionIndex + 1));
		}
	}

	// Get current question
	public ExamQuestion getCurrentQuestion() {
		if (questions.isEmpty()) {
			return null;			
		}
		return questions.get(currentQuestionIndex);
	}

	// Get current question number (1-based)
	public int getCurrentQuestionNumber() {
		return currentQuestionIndex + 1;
	}

	// Get student's answer for current question
	public String getCurrentAnswer() {
		int qid = getCurrentQuestion().getId();
		return answers.getOrDefault(qid, "");
	}

	// Auto-evaluate and calculate score
	public int calculateScore() {
		int score = 0;
		for (ExamQuestion q : questions) {
			String studentAns = answers.getOrDefault(q.getId(), "");
			if (studentAns.equals(q.getCorrectAnswer())) {
				score++;
			}
		}
		return score;
	}

	// Show summary before submission
	public void showSummary() {
		System.out.println("\nExam Summary for " + studentId);
		System.out.println("Total Questions: " + questions.size());
		System.out.println("Answered: " + answers.size());
		System.out.println("Current position: Q" + getCurrentQuestionNumber());
		System.out.println("Navigation history size: " + navigationStack.size());
	}
}