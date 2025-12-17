import java.util.Scanner;

public class KilometresToMilesUserInput {
    public static void main(String[] args) {
        //Creating variables for distance values
        double kilometres, miles;
        Scanner input = new Scanner(System.in);

        //Assigning kilometres distance value
        kilometres = input.nextDouble();
        //Converting kilometres to miles
        miles = kilometres * 1.6;

        //Displaying the results
        System.out.println("The total miles is " + miles + " mile for the given " + kilometres + " km");
        input.close(); // Closing Scanner object
    }
}