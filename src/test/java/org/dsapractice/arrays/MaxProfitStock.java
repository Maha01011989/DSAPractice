package org.dsapractice.arrays;

public class MaxProfitStock {


    public static void main(String[] args) {
        int maxProfit = 0;
        int[] prices = {2,4,1};
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    continue;
                } else {
                    profit = prices[j] - prices[i];
                    if (profit > maxProfit)
                        maxProfit = profit;
                }
            }
        }
        System.out.println(maxProfit);
    }
}








