import java.util.Scanner;

public class LC0412_FizzBuzz {
    // Prints FizzBuzz sequence from 1 to n
    public void fizzBuzz(int n) {
        // Loop through numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0412_FizzBuzz sol = new LC0412_FizzBuzz();

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        sol.fizzBuzz(n);
        input.close();
    }
}
