import java.util.Scanner;
public class FactorsOfNumberV2 {
    // Method to find factors of a number and return as array
    public static int[] findFactorsOfNumber(int number) {
        int count = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++; // count factors
            }
        }
        // Create array for factors
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[index++] = i; // store factors
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }

    // Method to find sum of factors
    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find product of cube of factors
    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= (long) Math.pow(factors[i], 3);
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactorsOfNumber(number);

        // Print factors
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + findGreatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cube of factors: " + productOfCubeOfFactors(factors));
        input.close();
    }
}
