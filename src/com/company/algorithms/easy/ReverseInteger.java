package com.company.algorithms.easy;

import java.util.Arrays;

public class ReverseInteger {
  private int reverse(int x) {
    String strX = Integer.toString(x);
    String tempStr = strX;
    if (strX.startsWith("-")) {
      tempStr = strX.substring(1);
    }

    int length = tempStr.length();
    char[] arr = new char[length];
    int j = 0;


    for (int i = (length - 1); i >= 0; i--) {
      arr[j] = tempStr.charAt(i);
      j++;
    }

    StringBuilder builder = new StringBuilder();
    if (strX.startsWith("-")) {
      builder.append("-");
    }
    for (char value : arr) {
      builder.append(value);
    }

    String temp = builder.toString();
    Long answer = Long.valueOf(temp);
    if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
      return 0;
    }
    return Integer.valueOf(temp);
  }

  public int optimizedReverse(int x) {
    int result = 0;

    while (x != 0) {
      int tail = x % 10;
      int newResult = result * 10 + tail;
      if ((newResult - tail) / 10 != result) {
        return 0;
      }
      result = newResult;
      x = x / 10;
    }

    return result;
  }

  public static void main(String[] args) {
    int x = -365;
    ReverseInteger reverseInteger = new ReverseInteger();

    System.out.print(reverseInteger.optimizedReverse(x));
  }
}
