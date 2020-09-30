package com.company;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices){
        //The price difference between day A and day B is the same as buying then selling the next day from day A to day B
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit+=prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
