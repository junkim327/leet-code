package com.company.algorithms.easy;

public class SingleNumber {
  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 5, 5, 10, 9, 10, 9};
    System.out.print(singleNumber(nums));
  }
}
