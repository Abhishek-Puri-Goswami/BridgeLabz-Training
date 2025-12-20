import java.util.Scanner;
public class SumNaturalNumbersComparison {
    // Create method to calculate sum of natural numbers using formula
    public static int findSumOfNaturalNumbersV1(int number) {
        return (number * (number + 1) / 2);
    }

    // Create method to calculate sum of natural numbers using recursion
    public static int findSumOfNaturalNumbersV2(int number) {
        if(number == 0) {
            return 0;
        }
        return number + findSumOfNaturalNumbersV2(number - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        
        if(number < 0) {
            System.err.println("Please enter a valid natural number.");
            System.exit(0);
        }

        int sum1 = findSumOfNaturalNumbersV1(number);
        int sum2 = findSumOfNaturalNumbersV2(number);
        System.out.println("The sum of " + number + " natural numbers using formula is " + sum1);
        System.out.println("The sum of " + number + " natural numbers using recursion is " + sum2);
       	input.close();
    }
}