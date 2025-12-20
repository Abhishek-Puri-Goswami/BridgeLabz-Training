import java.util.Scanner;
public class TrigonometricFunctions {
    // Create method to calculate different trigonometric functions using Math class
    public double[] calculateTrigonometricFunctions(double degrees) {
        double radians = Math.toRadians(degrees);

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[] {sinValue, cosValue, tanValue};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input of angle from user in degrees
        double angleInDegrees = input.nextDouble();
        TrigonometricFunctions obj = new TrigonometricFunctions();
        
        double[] results = obj.calculateTrigonometricFunctions(angleInDegrees);
        System.out.println("The of sine of " + angleInDegrees + " degrees is " + results[0]);
        System.out.println("The of cosine of " + angleInDegrees + " degrees is " + results[1]);
        System.out.println("The of tangent of " + angleInDegrees + " degrees is " + results[2]);
        input.close();
    }
}