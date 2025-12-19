import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input an integer number
        long number = input.nextLong();
        // Declare digits frequency array
        int[] frequency = new int[10];        

        // For negative numbers
        if (number < 0) {
            number = -number;
        }
        // Iterate for each digit and store frequency
        while (number > 0) {
            int digit = (int) (number % 10); // Find last digit
            frequency[digit]++;
            number /= 10; // Remove last digit
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " : " + frequency[i] + " times");
            }
        }
        input.close();
    }
}
