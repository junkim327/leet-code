package com.company.algorithms.easy;

public class ClimbingStairs {
  public static int climbStairs(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    int maxTwoSteps = n / 2;
    int remainingStep = n % 2;
    int combs;
    if (remainingStep == 0) {
      combs = 2;
    } else {
      combs = 1;
    }
    for (int i = 1; i < maxTwoSteps + remainingStep; i++) {
      double curCombs = findCombs(n - i, i);
      combs += curCombs;
    }

    return combs;
  }

  public static double findCombs(int elements, int combs) {
    double a = factorial(elements);
    double b = factorial(elements - combs);
    return Math.round((factorial(elements) / (factorial(combs) * factorial(elements - combs))));
  }

  public static double factorial(int num) {
    if (num == 0) {
      return 1;
    } else {
      return (num * factorial(num - 1));
    }
  }

  public static void main(String[] args) {
    System.out.println(climbStairs(35));
  }

}
