package org.dsapractice.arrays;

public class MaxProfitStock {


    public static void main(String[] args) {
        int maxProfit = 0;
        int[] prices = {7,6,4,3,1};
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxProfit) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }
        System.out.println(maxProfit);
    }
}








