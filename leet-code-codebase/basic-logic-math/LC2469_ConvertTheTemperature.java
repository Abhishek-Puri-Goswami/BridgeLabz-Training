import java.util.Scanner;

public class LC2469_ConvertTheTemperature {

    // Converts Celsius temperature to Kelvin and Fahrenheit
    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];

        result[0] = celsius + 273.15; // Kelvin
        result[1] = celsius * 1.80 + 32.00; // Fahrenheit

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC2469_ConvertTheTemperature sol = new LC2469_ConvertTheTemperature();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double[] result = sol.convertTemperature(celsius);

        System.out.println("Temperature in Kelvin: " + result[0]);
        System.out.println("Temperature in Fahrenheit: " + result[1]);
        input.close();
    }
}
