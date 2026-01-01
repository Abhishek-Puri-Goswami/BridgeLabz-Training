
/**
* 20. Festival Lucky Draw
* At Diwali mela, each visitor draws a number.
* If the number is divisible by 3 and 5, they win a gift.
* Use if, modulus, and loop for multiple visitors.
* continue if input is invalid. 
 */

import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = input.nextInt();

        // Loop for handling multiple visitors
        for (int i = 1; i <= visitors; i++) {
            System.out.print("\nVisitor " + i + ", enter your lucky number: ");
            int number = input.nextInt();

            // Skip invalid input
            if (number <= 0) {
                System.out.println("Invalid number. Try next visitor.");
                continue;
            }

            // Check winning condition
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift");
            } else {
                System.out.println("Sorry! Better luck next time.");
            }
        }

        System.out.println("Lucky Draw completed. Happy Diwali!");
        input.close();
    }
}
