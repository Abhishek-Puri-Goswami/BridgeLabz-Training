import java.util.Scanner;
public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet;
        double distanceInYards, distanceInMiles;
	
        //Input and calculation
        distanceInFeet = input.nextDouble();
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInFeet / 5280; 

	//displaying the results
        System.out.println("The distance of " + distanceInFeet + " feet is equal to " + distanceInYards + " yards and " + distanceInMiles + " miles");
	input.close(); //Closing the Scanner object
    }
}