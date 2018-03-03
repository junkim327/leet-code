package com.company.algorithms.easy;

public class RemoveDuplicates {
  public static int removeDuplicates(int[] nums) {
    int i = nums.length > 0 ? 1 : 0;
    for (int num : nums) {
      if (num > nums[i - 1]) {
        nums[i++] = num;
      }
    }

    return i;
  }

  public static void main(String[] args) {
    int[] nums = {2, 3, 3, 4, 10, 25, 25, 25, 25, 30};
    System.out.print(removeDuplicates(nums));
  }
}
