import java.util.Scanner;
public class TemperatureConverter {
    // Method to convert fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to get user input
    public static double getInput(String temperatureType) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in " + temperatureType + ": ");
        double value = input.nextDouble();
        input.close();
        return value;
    }

    // Method to display the output
    public static void displayOutput(double inputTemperature, double convertedTemperature, String inputUnit, String outputUnit) {
        System.out.println(
                inputTemperature + " " + inputUnit + " is equal to " + convertedTemperature + " " + outputUnit);
    }

    public static void main(String[] args) {
        // Get temperature in Fahrenheit and convert to Celsius
        double fahrenheit = getInput("Fahrenheit");
        double celsius = fahrenheitToCelsius(fahrenheit);
        displayOutput(fahrenheit, celsius, "Fahrenheit", "Celsius");

        // Get temperature in Celsius and convert to Fahrenheit
        double celsiusInput = getInput("Celsius");
        double fahrenheitConverted = celsiusToFahrenheit(celsiusInput);
        displayOutput(celsiusInput, fahrenheitConverted, "Celsius", "Fahrenheit");
    }
}
