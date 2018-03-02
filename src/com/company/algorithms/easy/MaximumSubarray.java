package com.company.algorithms.easy;

public class MaximumSubarray {
  public static int maxSubarray(int[] nums) {
    // This problem can be easily solved by Kadane's Algorithm.
    // I'd recommend you to watch this video if you are not familiar with this algorithm.
    // Video Link: https://www.youtube.com/watch?v=86CQq3pKSUw
    int maxCurrent = nums[0];
    int maxGlobal = nums[0];
    for (int i = 1; i <= nums.length - 1; i++) {
      maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
      maxGlobal = Math.max(maxCurrent, maxGlobal);
    }

    return maxGlobal;
  }

  public static void main(String[] args) {
    int[] nums = {-2, 1};
    System.out.print(maxSubarray(nums));
    // Runtime: 15ms
  }
}
