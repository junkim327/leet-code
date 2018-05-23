package com.company.algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public static int majorityElement(int[] nums) {
    int element = nums[0];
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (count == 0) {
        count++;
        element = nums[i];
      } else if (element == nums[i]) {
        count++;
      } else {
        count--;
      }
    }

    return element;
  }

  public static int alternativeSol(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }

    Arrays.sort(nums);

    return nums[nums.length / 2];
  }

  public static void main(String[] args) {
    int[] nums = {3, 3, 4, 2, 2, 3, 3, 3, 3 ,3, 2};
    System.out.println(majorityElement(nums));
  }
}
