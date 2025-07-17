import java.util.*;

public class BestTimeToBuyAndSellStock {

    public static void testMaxProfit(int[] prices) {
        int result = maxProfit(prices);
        System.out.printf("The max profit in the array %s is %s\n", Arrays.toString(prices), result);
    }

    public static int maxProfit(int[] prices){
        if(prices == null || prices.length <= 1) return 0;

        int lowest = prices[0];
        int profit = 0;
        for(int i=1; i < prices.length; i++) {
            if(prices[i] - lowest > profit) {
                profit = prices[i] - lowest;
            } else if (lowest > prices[i]) {
                lowest = prices[i];
            }

            //System.out.printf("lowest is %s and profit is %s\n", lowest, profit);
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock.testMaxProfit(new int[] {7,1,5,3,6,4}); //5
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {7,6,4,3,1}); //0
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {2,7,1,3,4}); //5
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {1,2,3,4,5}); // 4 (buy day 1 sell day 5)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {5,4,3,2,1}); // 0 (no profit)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {3,3,3,3,3}); // 0 (prices constant)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {1}); // 0 (only one day)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {1,2}); // 1 (buy day 1 sell day 2)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {2,1,4}); // 3 (buy day 2 sell day 3)
       BestTimeToBuyAndSellStock.testMaxProfit(new int[] {3,2,6,5,0,3}); // 4 (buy day 2 sell day 3)
    }
}