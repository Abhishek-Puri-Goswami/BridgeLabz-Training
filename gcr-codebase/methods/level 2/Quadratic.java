import java.util.Scanner;
public class Quadratic {
    // Method to calculate the roots of the quadratic equation ax^2 + bx + c
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta (discriminant)
        double delta = Math.pow(b, 2) - 4 * a * c;
        double[] roots;

        // Case 1: Delta is positive, two real roots
        if (delta > 0) {
            roots = new double[2];  // Array to store two roots
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a);
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a);
        }
        // Case 2: Delta is zero, one real root
        else if (delta == 0) {
            roots = new double[1];  // Array to store one root
            roots[0] = -b / (2 * a);
        }
        // Case 3: Delta is negative, no real roots
        else {
            roots = new double[0];  // Empty array indicating no real roots
        }

        return roots;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        // Find the roots
        double[] roots = findRoots(a, b, c);

        // Display the results
        if (roots.length == 0) {
            System.out.println("No real roots exist.");
        } else if (roots.length == 1) {
            System.out.println("The root is: " + roots[0]);
        } else {
            System.out.println("The roots are: " + roots[0] + " and " + roots[1]);
        }
        input.close();
    }
}
