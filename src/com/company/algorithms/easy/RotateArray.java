package com.company.algorithms.easy;

public class RotateArray {
  public static void rotate(int[] nums, int k) {
    // 3 4 5 6 7 8 9

    // 0 1 2 3 4 5 6

    // k = 3

    // 7 8 9 3 4 5 6

    // 4 5 6 0 1 2 3
    // 0 1 2 3 4 5 6
    int arrLength = nums.length;
    int[] rotatedNums = new int[arrLength];
    for (int i = 0; i < arrLength; i++) {
      if (i + k >= arrLength) {
        rotatedNums[i + k - ((i + k) / arrLength) * arrLength] = nums[i];
      } else {
        rotatedNums[i + k] = nums[i];
      }
    }

    for (int num : rotatedNums) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] nums = {3, 4, 7, 10, 11, 15, 20};
    int[] zero = {0, 1};
    int steps = 4;
    rotate(nums, steps);
    rotate(zero, steps);
  }
}
