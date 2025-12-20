import java.util.Scanner;
public class WindChill {
    // Create method to calculate the wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take input of temperature and wind speed from user
        double temperature  = input.nextDouble();
        double windSpeed  = input.nextDouble();

        // Creating object of WindChill to access non-static method
        WindChill obj = new WindChill();
        
        double windChill = obj.calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is " + windChill + " for temperature " + temperature + " and wind speed " + windSpeed);
        input.close();
    }
}