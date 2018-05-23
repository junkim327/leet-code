package com.company.algorithms.easy;

public class MoveZeroes {
  public static void moveZeores(int[] nums) {
    int zeroLoc = nums[0] == 0 ? 0 : -1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != 0 && zeroLoc != -1) {
        nums[zeroLoc] = nums[i];
        nums[i] = 0;
        zeroLoc++;
      } else if (zeroLoc == -1 && nums[i] == 0) {
        zeroLoc = i;
      }
    }

    MoveZeroes.printArray(nums);
  }

  private static void printArray(int[] nums) {
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = {0, 1, 4, 17, 0, 3, 12, 0, 9};
    int[] nums2 = {1, 0, 1};
    moveZeores(nums2);
  }
}
