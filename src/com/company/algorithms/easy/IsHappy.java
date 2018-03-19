package com.company.algorithms.easy;

public class IsHappy {
  public static boolean isHappy(int n) {
    int sum = 0;
    while (n != 0) {
      sum += (n % 10) * (n % 10);
      n /= 10;
    }

    if (sum == n) {
      return false;
    }

    boolean isHappyNumber = isHappy(sum);
    while (!isHappyNumber) {

    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(isHappy(19));
  }
}
