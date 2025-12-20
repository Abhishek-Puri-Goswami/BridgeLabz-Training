import java.util.Scanner;
public class AtheteRunner {
    public static int findNumberOfRounds(int perimeter, int distance) {
        return (distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input sides of triangular park in metres
        int side1  = input.nextInt();
        int side2  = input.nextInt();
        int side3  = input.nextInt();

        int perimeter = side1 + side2 + side3;
        int distance = 5000; // 5km = 5000m

        int rounds = findNumberOfRounds(perimeter, distance);
        System.out.println("The athlete needs to run " + rounds + " rounds.");
       	input.close();
    }
}