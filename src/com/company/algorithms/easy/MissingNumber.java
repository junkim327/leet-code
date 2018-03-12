package com.company.algorithms.easy;

public class MissingNumber {
  public static int missingNumber(int[] nums) {
    int sum = nums.length * (nums.length + 1) / 2;
    int arrsum = 0;
    for (int num : nums) {
      arrsum += num;
    }

    return sum - arrsum;
  }

  public static void main(String[] args) {
    int[] nums = {0, 1, 3, 4, 5, 6};
    System.out.println(missingNumber(nums));
  }
}
