import java.util.Scanner;

public class CentimetersToFeetAndInches {
    public static void main(String[] args) {
        //Creating variables to store height values
        double centimetres, inches, feet;
        Scanner input = new Scanner(System.in);

        //Assigning the height given in centimetres
        centimetres = input.nextDouble();
        //Converting height from centimetres inches
        double totalInches = centimetres / 2.54;
        //Converting inches to feet and inches
        feet = Math.floor(totalInches / 12);
        inches = totalInches - (12 * feet);

        //Displaying the results
        System.out.println("Your Height in cm is " + centimetres + " while in feet is " + feet + " and inches is " + inches);
        input.close(); //Closing the Scanner object
    }
}