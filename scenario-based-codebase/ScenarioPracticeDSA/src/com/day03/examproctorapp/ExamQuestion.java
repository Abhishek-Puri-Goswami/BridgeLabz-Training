package com.day03.examproctorapp;

public class ExamQuestion {
	private final int id;
	private final String questionText;
	private final String correctAnswer;

	public ExamQuestion(int id, String questionText, String correctAnswer) {
		this.id = id;
		this.questionText = questionText;
		this.correctAnswer = correctAnswer;
	}

	public int getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}
}