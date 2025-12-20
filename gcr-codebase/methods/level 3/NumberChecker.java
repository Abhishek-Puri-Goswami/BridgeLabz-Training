import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0'; // Convert char to int
        }
        return digits;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 1; i < digits.length; i++) { // Start from index 1 to skip leading zero
            if (digits[i] == 0) {
                return true; // Contains zero (not leading)
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

        boolean isDuck = isDuckNumber(number);
        System.out.println(number + " is a Duck Number: " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(number + " is an Armstrong Number: " + isArmstrong);

        int[] largestNumbers = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestNumbers[0]);
        System.out.println("Second largest digit: " + largestNumbers[1]);

        int[] smallestNumbers = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestNumbers[0]);
        System.out.println("Second smallest digit: " + smallestNumbers[1]);
        input.close();
    }
}
