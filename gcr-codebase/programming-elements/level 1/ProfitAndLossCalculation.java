public class ProfitAndLossCalculation {
    public static void main(String[] args) {
        //Creating variables to store buy and sell details
        double costPrice, sellingPrice;
        double profit, profitPercent;

        //Assigning given values to the variables
        costPrice = 129;
        sellingPrice = 191;
        profit = sellingPrice - costPrice;
        profitPercent = (profit / costPrice) * 100;

        //Displaying the results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}