import java.util.Scanner;
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter;
        double side;
	
        //Input and calculation
        perimeter = input.nextDouble();
        side = perimeter / 4;

	//displaying the results
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
	input.close(); //Closing the Scanner object
    }
}