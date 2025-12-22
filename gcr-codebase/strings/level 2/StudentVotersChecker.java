import java.util.Random;
import java.util.Scanner;
public class StudentVotersChecker {
    // Method to generate random 2-digit ages for numberOfStudents students
    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10; // Generate random age between 10 and 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] results) {
        System.out.printf("%-10s%-15s%n", "Age", "Eligibility");
        System.out.println("-------------------------");
        for (String[] result : results) {
            System.out.printf("%-10s%-15s%n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input the number of students
        int numberOfStudents = input.nextInt();

        // Store the results
        int[] ages = generateAges(numberOfStudents);
        String[][] eligibilityResults = checkVotingEligibility(ages);

        // Display the results
        displayResults(eligibilityResults);
        input.close();
    }
}
