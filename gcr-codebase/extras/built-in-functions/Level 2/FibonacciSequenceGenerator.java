import java.util.Scanner;
public class FibonacciSequenceGenerator {
    private static void generateFibonacci(int terms) {
        int first = 0, second = 1;
        System.out.println("Fibonacci sequence up to " + terms + " terms:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = input.nextInt();
        
        if (terms <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            generateFibonacci(terms);
        }
        input.close();
    }
}
