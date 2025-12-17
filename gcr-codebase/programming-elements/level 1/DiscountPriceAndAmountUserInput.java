import java.util.Scanner;

public class DiscountPriceAndAmountUserInput {
    public static void main(String[] args) {
        //Creating variables to store fee and discount details
        double fee, discountPercent;
        //Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Assigning fee and discount values
        fee = input.nextDouble();
        discountPercent = input.nextDouble();
        //Calculating the amount of discount
        double discount = (fee * discountPercent) / 100;
        //Calculating the final fee after discount
        double finalFee = fee - discount;

        //Displaying the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        input.close(); //Closing Scanner object
    }
}