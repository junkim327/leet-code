package com.company.algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
  public static void main(String[] args) {
    TwoSums ts = new TwoSums();
    int[] arr = {4, 10, 9};
    int target = 13;
    int[] result = ts.twoSum(arr, target);
    System.out.print(Arrays.toString(result));
  }

  private int[] twoSum(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i])) {
        return new int[] {map.get(target - numbers[i]), i};
      }
      map.put(numbers[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
