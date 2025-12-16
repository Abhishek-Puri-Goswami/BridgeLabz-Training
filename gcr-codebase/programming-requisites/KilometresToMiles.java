import java.util.Scanner;

class KilometresToMiles {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Kilometres to Miles Convertor");
		
	System.out.print("Enter the value in Kilometres : ");
	double kilometres = sc.nextDouble();
	sc.close();
		 
	final double KM_TO_MILE_FACTOR = 0.621371;
	System.out.println("The value in miles is : " + (kilometres * KM_TO_MILE_FACTOR));
    }
}