import java.util.Scanner;
public class GCDLCMCalculator {
    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the relationship LCM(a, b) = (a * b) / GCD(a,
    // b)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Method to get user input
    public static int[] getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        input.close();
        return new int[] { num1, num2 };
    }

    // Method to display the output
    public static void displayOutput(int gcd, int lcm) {
        System.out.println("The GCD is: " + gcd);
        System.out.println("The LCM is: " + lcm);
    }

    public static void main(String[] args) {
        int[] numbers = getInput();
        int num1 = numbers[0];
        int num2 = numbers[1];
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the result
        displayOutput(gcd, lcm);
    }
}
