import java.util.Scanner;

public class LC0121_BestTimeToBuyAndSellStock {

    // Finds maximum profit from one buy and one sell
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Track minimum price and best profit
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LC0121_BestTimeToBuyAndSellStock sol = new LC0121_BestTimeToBuyAndSellStock();

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = input.nextInt();
        }

        System.out.println(sol.maxProfit(prices));

        input.close();
    }
}
