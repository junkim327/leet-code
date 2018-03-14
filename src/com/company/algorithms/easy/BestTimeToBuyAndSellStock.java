package com.company.algorithms.easy;

public class BestTimeToBuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int buyingPrice = 0;
    int maxDiff = 0;
    for (int i = 0; i < prices.length; i++) {
      if (i == 0) {
        buyingPrice = prices[i];
      } else if (prices[i] > buyingPrice) {
        maxDiff = (maxDiff < prices[i] - buyingPrice) ? (prices[i] - buyingPrice) : maxDiff;
      } else if (prices[i] < buyingPrice) {
        buyingPrice = prices[i];
      }
    }

    return maxDiff;
  }

  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    System.out.println(maxProfit(new int[]{2, 4, 1}));
    // Runtime : 3ms
  }
}
