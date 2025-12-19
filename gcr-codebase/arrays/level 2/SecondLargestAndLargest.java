import java.util.Scanner;
public class SecondLargestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Store 10 digits of the number into array
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;
        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("The argest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
        input.close();
    }
}
