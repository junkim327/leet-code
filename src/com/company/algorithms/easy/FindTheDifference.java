package com.company.algorithms.easy;

public class FindTheDifference {
  public static char findTheDifference(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    int sSum = 0;
    int tSum = 0;
    for (int i = 0; i < tArr.length; i++) {
      if (i == (tArr.length - 1)) {
        tSum += tArr[i];
        break;
      }
      sSum += sArr[i];
      tSum += tArr[i];
    }

    return (char)(tSum - sSum);
  }

  public static char bitManipulationMethod(String s, String t) {
    char c = 0;
    for (int i = 0; i < s.length(); i++) {
      c ^= s.charAt(i);
      c ^= t.charAt(i);
    }

    c ^= t.charAt(t.length() - 1);

    return c;
  }

  public static void main(String[] args) {
    System.out.println(findTheDifference("abdf", "abedf"));
    // Runtime: 6ms

    System.out.println(bitManipulationMethod("abdf", "abedf"));
    // Runtime: 6ms
  }
}
