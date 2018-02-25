package com.company.algorithms.easy;

public class StrStr {
  public static int strStr(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      for (int j = 0; j < needle.length() && haystack.charAt(i + j) == needle.charAt(j); j++) {
        if (j == needle.length() - 1) {
          return i;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int index = strStr("heool", "l");
    System.out.print(index);
  }
}
