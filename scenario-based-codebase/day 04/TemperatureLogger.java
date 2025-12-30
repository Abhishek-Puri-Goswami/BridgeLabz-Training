/**
 * 11. Temperature Logger
 *      Record temperatures over 7 days.
 *      Use array and for-loop.
 *      Find average and max temperature.
 *      Use if for comparisons. Maintain readable naming and modular code blocks.
 * 
 */

import java.util.Scanner;
public class TemperatureLogger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Number of days
        final int DAYS = 7;
        double[] temperatures = new double[DAYS];
        double sum = 0.0;
        double average;
        double maxTemperature = Double.MIN_VALUE;

        System.out.println("============================================");
        System.out.println("            TEMPERATURE LOGGER");
        System.out.println("============================================");
        System.out.println("Enter temperatures for 7 days:");
        System.out.println("--------------------------------------------");

        // Input temperatures and store sum & maximum
        for (int i = 0; i < DAYS; i++) {
            System.out.printf(" Day %2d Temperature   |    ", i + 1);
            temperatures[i] = input.nextDouble();

            sum += temperatures[i];
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        // Calculate average temperature
        average = sum / DAYS;

        // Display the results
        System.out.println("--------------------------------------------");
        System.out.printf(" %-20s |  %-20s%n", "Average Temperature", "Maximum Temperature");
        System.out.println("--------------------------------------------");
        System.out.printf(" %-20.2f |    %-20.2f%n", average, maxTemperature);
        System.out.println("---------------------------------------	-----");
        input.close();
    }
}
