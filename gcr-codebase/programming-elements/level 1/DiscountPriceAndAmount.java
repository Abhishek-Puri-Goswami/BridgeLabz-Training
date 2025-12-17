public class DiscountPriceAndAmount {
    public static void main(String[] args) {
        //Creating variables to store fee and discount details
        double fee, discountPercent;

        //Assigning fee and discount values
        fee = 1_25_000;
        discountPercent = 10;
        //Calculating the amount of discount
        double discount = (fee * discountPercent) / 100;
        //Calculating the final fee after discount
        double finalFee = fee - discount;

        //Displaying the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}