package com.company.algorithms.medium;

public class FindTheDuplicateNumber {
  public int findDuplicate(int[] nums) {
    int hare = nums[0];
    int tortoise = nums[0];

    do {
      hare = nums[nums[hare]];
      tortoise = nums[tortoise];
    } while(hare != tortoise);

    tortoise = nums[0];
    while (tortoise != hare) {
      tortoise = nums[tortoise];
      hare = nums[hare];
    }

    return hare;
  }
}
