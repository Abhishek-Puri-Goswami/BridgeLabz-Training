import java.util.*;
public class NumberCheckerV3 {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        String numberString = String.valueOf(Math.abs(number));
        int[] digits = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int i = 1; i < digits.length; i++) { // Starting from index 1 to ignore leading zeros
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter a number: ");
        int number2 = input.nextInt();

        int digitCount1 = countDigits(number1);
        System.out.println("Count of digits in " + number1 + ": " + digitCount1);

        int[] digits1 = storeDigits(number1);
        System.out.println("Digits of " + number1 + ": " + Arrays.toString(digits1));

        int digitCount2 = countDigits(number2);
        System.out.println("Count of digits in " + number2 + ": " + digitCount2);

        int[] digits2 = storeDigits(number2);
        System.out.println("Digits of " + number2 + ": " + Arrays.toString(digits2));

        int[] reversedDigits1 = reverseDigitsArray(digits1);
        System.out.println("Reversed digits of " + number1 + ": " + Arrays.toString(reversedDigits1));

        boolean arraysEqual = areArraysEqual(digits1, digits2);
        System.out.println("Are the digit arrays of " + number1 + " and " + number2 + " equal? " + arraysEqual);

        boolean isPalindromeNumber = isPalindrome(number1);
        System.out.println(number1 + " is a Palindrome: " + isPalindromeNumber);

        boolean isDuck = isDuckNumber(number1);
        System.out.println(number1 + " is a Duck Number: " + isDuck);
        input.close();
    }
}
