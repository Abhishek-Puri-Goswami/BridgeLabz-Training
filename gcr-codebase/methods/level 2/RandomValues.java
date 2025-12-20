import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        // Generate random numbers between 1000 and 9999
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * (9999 - 1000 + 1)) + 1000;
        }

        return randomNumbers;
    }

    // Method to find average, minimum and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Calculate the sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = sum / numbers.length;

        // Return average, min, and max in a double array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display the generated random numbers
        System.out.println("Generated random 4-digit numbers:");
        for (int num : randomNumbers) {
            System.out.println(num);
        }

        // Find the average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
