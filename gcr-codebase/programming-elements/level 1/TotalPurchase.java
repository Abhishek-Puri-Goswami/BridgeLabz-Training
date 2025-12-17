import java.util.Scanner;
public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice, quantity;
        double totalPrice;
	
        //Input and calculation
        unitPrice = input.nextDouble();
        quantity = input.nextDouble();
        totalPrice = unitPrice * quantity; 

	//displaying the results
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
	input.close(); //Closing the Scanner object
    }
}