
/**
 * 17. Online Quiz Application
 * Ask 5 questions (MCQs) from a user.
 * Use arrays and for-loop.
 * Record score.
 * Switch for answer checking. Apply clear indentation and structured layout.
 */

import java.util.Scanner;
public class OnlineQuizApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {
                "1. Which keyword is used to create an object in Java?",
                "2. Which data type is used to store decimal values?",
                "3. Which loop is guaranteed to execute at least once?",
                "4. Which keyword is used to inherit a class in Java?",
                "5. Which method is the entry point of a Java program?"
        };

        String[][] options = {
                { "a) class", "b) new", "c) static", "d) void" },
                { "a) int", "b) char", "c) double", "d) boolean" },
                { "a) for", "b) while", "c) do-while", "d) foreach" },
                { "a) this", "b) super", "c) extends", "d) implements" },
                { "a) start()", "b) run()", "c) main()", "d) init()" }
        };

        char[] correctAnswers = { 'b', 'c', 'c', 'c', 'c' };
        int score = 0;

        // Loop to ask each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            // Loop to display options
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char answer = input.next().toLowerCase().charAt(0);

            // Switch to check answer
            switch (answer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (answer == correctAnswers[i]) {
                        score++;
                        System.out.println("Correct answer!");
                    } else {
                        System.out.println("Wrong answer!");
                    }
                    break;
                default:
                    System.out.println("Invalid option selected.");
            }
        }

        // Display final score
        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.length);
        input.close();
    }
}
