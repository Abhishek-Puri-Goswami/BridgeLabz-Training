import java.util.Scanner;
public class StudentVoteChecker {
    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return (age >= 18);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        // Create an array to store the ages of 10 students
        int[] studentAges = new int[10];

        // Input and process ages for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") is not eligible to vote.");
            }
        }
        input.close();
    }
}
