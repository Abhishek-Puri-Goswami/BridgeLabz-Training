import java.util.Scanner;
public class FactorsOfNumber {
    // Method to find factors of the number in an array
    public static int[] findfactorsOfNumber(int number) {
        int count = 0; // number of factors
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static void printFactors(int[] factors) {
        for(int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }

    public static long addFactors(int[] factors) {
        long sumFactors = 0;
        for(int i = 0; i < factors.length; i++) {
            sumFactors += factors[i];
        }
        return sumFactors;
    }

    public static long multiplyFactors(int[] factors) {
        long productFactors = 1;
        for(int i = 0; i < factors.length; i++) {
            productFactors *= factors[i];
        }
        return productFactors;
    }

    
    public static long addSquaredFactors(int[] factors) {
        long sumSquaredFactors = 0;
        for(int i = 0; i < factors.length; i++) {
            sumSquaredFactors += (long) Math.pow(factors[i], 2);
        }
        return sumSquaredFactors;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int[] factors = findfactorsOfNumber(number);
        printFactors(factors);
        long sumFactors = addFactors(factors);
        long productFactors = multiplyFactors(factors);
        long sumSquaredFactors = addSquaredFactors(factors);
        
        System.out.println("Sum of factors of " + number + " is " + sumFactors);
        System.out.println("Product of factors of " + number + " is " + productFactors);
        System.out.println("Sum of squares of factors of " + number + " is " + sumSquaredFactors);
       	input.close();
    }
}