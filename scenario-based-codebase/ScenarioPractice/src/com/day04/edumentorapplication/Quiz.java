package com.day04.edumentorapplication;

public class Quiz {

    private String[] questions;
    private char[] correctAnswers;
    private int score;

    // Creates quiz based on difficulty level
    public Quiz(String difficulty) {

        if (difficulty.equalsIgnoreCase("Easy")) {
            questions = new String[]{
                "Java is platform independent? (A/B)",
                "JVM stands for Java Virtual Machine? (A/B)"
            };
            correctAnswers = new char[]{'A', 'A'};
        } else {
            questions = new String[]{
                "Interface supports multiple inheritance? (A/B)",
                "String class is immutable? (A/B)"
            };
            correctAnswers = new char[]{'A', 'A'};
        }
        score = 0;
    }

    // Calculates score by comparing answers
    public void attemptQuiz(char[] userAnswers) {

        // Loop checks each answer against correct key
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                score += 10;
            }
        }
    }

    // getter for score
    public int getScore() {
        return score;
    }

    // method to get total maximum score
    public int getTotalMarks() {
        return correctAnswers.length * 10;
    }

    // Displays all quiz questions
    public void printQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%d. %s%n", i + 1, questions[i]);
        }
    }
}
