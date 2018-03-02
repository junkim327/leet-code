package com.company.algorithms.easy;

public class SumOfTwoIntegers {
  public static int getSum(int a, int b) {
    if (b == 0) {
      return a;
    }
    int sum = a ^ b;
    int carry = (a & b) << 1;

    return getSum(sum, carry);
  }

  public static int iterativeGetSum(int a, int b) {
    if (a == 0) {
      return b;
    } else if (b == 0) {
      return a;
    }

    while (b != 0) {
      int carry = a & b;
      a = a ^ b;
      b = carry << 1;
    }

    return a;
  }

  public static void main(String[] args) {
    int a = 0;
    int b = 10;
    System.out.println(getSum(a, b));
    // Runtime: 0ms
    System.out.print(iterativeGetSum(a, b));
    // Runtime: 0ms
  }
}
