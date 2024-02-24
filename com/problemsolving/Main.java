package com.problemsolving;

import com.problemsolving.slidingwindow.BestTimeToBuyAndSellStock;

public class Main {
  public static void main(String[] args) {
    BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
//    int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{7,6,4,3,1});
//    int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{2,1,4});
    int result = bestTimeToBuyAndSellStock.maxProfit(new int[]{2,4,1});
    System.out.println(result);
  }
}
