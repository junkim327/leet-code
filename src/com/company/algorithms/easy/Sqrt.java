package com.company.algorithms.easy;

public class Sqrt {
  public static int mySqrt(int x) {
    long i = 0;
    while (((i + 1) * (i + 1)) <= x) {
      i++;
    }

    return (int)i;
    // Runtime: 78ms
  }

  public static int newtonSqrt(int x) {
    long i = x;
    while (i * i > x) {
      i = (i + x / i) / 2;
    }

    return (int)i;
    // Runtime: 43ms
  }

  public static void main(String[] args) {
    int num = 2147395600;
    System.out.println(mySqrt(num));
    System.out.println(newtonSqrt(num));
    System.out.print(Integer.MAX_VALUE);
  }
}
