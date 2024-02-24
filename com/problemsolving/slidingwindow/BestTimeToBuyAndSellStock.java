package com.problemsolving.slidingwindow;

public class BestTimeToBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int left = 0;
    int right = 1;
    int profit = 0;
    while (left != right && right <= prices.length - 1) {
      int result = prices[right] - prices[left];
      if (result > 0) {
        profit = Math.max(profit, result);
      } else {
        left = right;
      }
      right++;
    }
    return profit;
  }
}
