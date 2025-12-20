import java.util.*;
public class NumberCheckerV2 {
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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10]; // frequency of digits 0-9
        for (int digit : digits) {
            frequency[digit]++;
        }
        // Create a 2D array to store digit and its frequency
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i; // Digit
            frequencyArray[i][1] = frequency[i]; // Frequency
        }
        return frequencyArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + digitCount);

        int[] digits = storeDigits(number);
        System.out.println("Digits of " + number + ": " + Arrays.toString(digits));

        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits of " + number + ": " + sumOfDigits);

        int sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits of " + number + ": " + sumOfSquares);

        boolean isHarshad = isHarshadNumber(number);
        System.out.println(number + " is a Harshad Number: " + isHarshad);

        int[][] frequencyArray = findDigitFrequency(digits);
        System.out.println("Digit frequencies in " + number + ":");
        for (int[] entry : frequencyArray) {
            if (entry[1] > 0) { // Display only digits with frequency > 0
                System.out.println("Digit " + entry[0] + ": " + entry[1] + " time(s)");
            }
        }
        input.close();
    }
}
