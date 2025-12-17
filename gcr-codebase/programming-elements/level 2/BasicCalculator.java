import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        double addition, subtraction, product, division;
	
        //Calculator operations
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        addition = num1 + num2;        
        subtraction = num1 - num2;
        product = num1 * num2;
        division = num1 / num2;

	//displaying the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + addition + ", " + subtraction + ", " + product + ", and " + division);
	input.close();
    }
}