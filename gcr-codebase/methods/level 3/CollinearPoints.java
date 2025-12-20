import java.util.Scanner;

public class CollinearPoints {

    // Method to check if the points are collinear using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the slopes of AB, BC, and AC
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        // Points are collinear if slopes are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if the points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area of the triangle formed by the points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is zero
        return (area == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs for the three points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        boolean areCollinearUsingSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        if (areCollinearUsingSlope) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        boolean areCollinearUsingArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        if (areCollinearUsingArea) {
            System.out.println("The points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of triangle formula.");
        }
        input.close();
    }
}
