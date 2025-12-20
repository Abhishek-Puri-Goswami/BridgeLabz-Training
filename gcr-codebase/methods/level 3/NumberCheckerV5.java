import java.util.*;
public class NumberCheckerV5 {
    // Method to find the factors of a number using two loops
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // count factors
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // store factors
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    // Method to find the sum of the factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cubes of the factors
    public static long findProductOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate the factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " "); // Print factors
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));

        // Find sum of factors
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));

        System.out.println("Product of Factors: " + findProductOfFactors(factors));

        System.out.println("Product of Cubes of Factors: " + findProductOfCubesOfFactors(factors));

        System.out.println(number + " is a Perfect Number: " + isPerfectNumber(number));

        System.out.println(number + " is an Abundant Number: " + isAbundantNumber(number));

        System.out.println(number + " is a Deficient Number: " + isDeficientNumber(number));

        System.out.println(number + " is a Strong Number: " + isStrongNumber(number));
        input.close();
    }
}
