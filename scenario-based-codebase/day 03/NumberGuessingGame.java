
/**
 * 7. The Number Guessing Game
 *      A game asks the player to guess a number between 1 and 100.
 *      Core Java Scenario Based Problem Statements
 *      Use do-while loop.
 *      Give hints like "Too high" or "Too low".
 *      Count attempts and exit after 5 wrong tries.
 */

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("======================================");
        System.out.println("        NUMBER GUESSING GAME");
        System.out.println("======================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 5 attempts.");
        System.out.println("--------------------------------------");

        do {
            System.out.print("-> Attempt " + (attempts + 1) + " - Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            System.out.println("--------------------------------------");
            if (guess > number) {
                System.out.println("-> Result : Too High");
            } else if (guess < number) {
                System.out.println("-> Result : Too Low");
            } else {
                System.out.println("-> Result : Correct Guess!");
                System.out.println("-> You guessed the number in " + attempts + " attempts.");
                break;
            }

            if (attempts == maxAttempts) {
                System.out.println("-> Game Over! Maximum attempts reached.");
                System.out.println("-> Correct Number : " + number);
            }
            System.out.println("--------------------------------------");
        } while (attempts < maxAttempts);

        System.out.println("THANK YOU FOR PLAYING THE GAME!");
        System.out.println("======================================");

        input.close();
    }
}
