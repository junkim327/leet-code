package com.company.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    return set.size() != nums.length;
  }

  public static void main (String[] args) {
    int[] nums = {3, 5, 5, 7, 8, 9, 2};
    System.out.println(containsDuplicate(nums));
    // Runtime: 15ms.
  }
}
