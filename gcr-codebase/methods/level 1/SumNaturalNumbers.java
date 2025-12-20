import java.util.Scanner;
public class SumNaturalNumbers {
    // Create method to calculate sum of natural numbers
    public static int findSumOfNaturalNumbers(int number) {
        int sum = 0;
        for(int i = number; i >= 0; i--) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input a natural number
        int number  = input.nextInt();
        // Check if number is negative
        if(number < 0) {
            System.err.println("Please enter a valid natural number.");
            System.exit(0);
        }
        int sum = findSumOfNaturalNumbers(number);
        System.out.println("The sum of " + number + " natural numbers is " + sum);
       	input.close();
    }
}