package com.company.algorithms.medium;

import java.util.HashMap;

public class FourSumCount {
  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    int result = 0;
    HashMap<Integer, Integer> count = new HashMap<>();
    for (int a : A) {
      for (int b: B) {
        int sum = a + b;
        count.put(sum, count.getOrDefault(sum, 0) + 1);
      }
    }

    for (int c : C) {
      for (int d: D) {
        int sum = c + d;
        result += count.getOrDefault(-1 * sum, 0);
      }
    }

    return result;
  }
}
