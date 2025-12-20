import java.util.Random;
import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths for each student
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        // 2D array for subject scores physics, chemistry, and maths
        int[][] scores = new int[numStudents][3];
        // Random score between 50 and 100
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics
            scores[i][1] = 50 + random.nextInt(51); // Chemistry
            scores[i][2] = 50 + random.nextInt(51); // Maths
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores) {
        // 2D array for total, average, percentage
        double[][] results = new double[scores.length][4]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; 
            double average = total / 3.0; 
            double percentage = (total / 300.0) * 100;            
            // Round off the values to 2 decimal places
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.printf("%-10s | %8s | %10s | %8s | %10s | %10s | %11s%n",
            "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s | %8d | %10d | %8d | %10.2f | %10.2f | %10.2f%%%n",
                "Student " + (i + 1),
                scores[i][0],
                scores[i][1],
                scores[i][2],
                results[i][0],
                results[i][1],
                results[i][2]);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        
        int[][] studentScores = generateRandomScores(numStudents);
        double[][] studentResults = calculateScores(studentScores);

        displayScorecard(studentScores, studentResults);
        input.close();
    }
}
