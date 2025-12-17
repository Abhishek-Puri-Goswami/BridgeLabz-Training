import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height; //in centimetres
        double areaInSqCentimetres, areaInSqInches;
	
        //Input and calculation
        base = input.nextDouble();
        height = input.nextDouble();
	areaInSqCentimetres = base * height / 2;
        areaInSqInches = areaInSqCentimetres / 6.4516;
        
	//displaying the results
        System.out.println("The area of triange in square centimetres is " + areaInSqCentimetres + " and square inches is " + areaInSqInches);
	input.close(); //Closing the Scanner object
    }
}