import java.util.Scanner;
public class ChocolatesDistribution {
    // Method to find the number of remaining and per student chocolates
    public static int[] findRemainingAndChocolatesPerStudent(int numberOfStudents, int chocolates) {
        int chocolatesPerStudents = chocolates / numberOfStudents;
        int chocolatesRemaining = chocolates % numberOfStudents;
        return new int[]{chocolatesRemaining, chocolatesPerStudents};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input three integer numbers
        int numberOfStudents  = input.nextInt();
        int chocolates  = input.nextInt();
        
        int[] results = findRemainingAndChocolatesPerStudent(numberOfStudents, chocolates);
        System.out.println("The number of remaining chocolates is " + results[0]);
        System.out.println("The number of chocolates per student is " + results[1]);
       	input.close();
    }
}