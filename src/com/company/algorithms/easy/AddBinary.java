package com.company.algorithms.easy;

public class AddBinary {
  public static void main(String[] args) {
    String str1 = "101";
    String str2 = "1";

    AddBinary ab = new AddBinary();
    String result = ab.addBinary(str1, str2);
    System.out.println(result);
  }

  private String addBitStrings(String str1, String str2) {
    int len1 = str1.length();
    int len2 = str2.length();
    if (str1.length() < str2.length()) {
      StringBuilder s1 = new StringBuilder(str1);
      for (int i = 0; i < len2 - len1; i++) {
        s1.insert(0, 0);
      }
      str1 = s1.toString();
    } else {
      StringBuilder s2 = new StringBuilder(str2);
      for (int i = 0; i < len1 - len2; i++) {
        s2.insert(0, 0);
      }
      str2 = s2.toString();
    }
    int length = str1.length();
    int carry = 0;

    StringBuilder result = new StringBuilder();
    for (int i = length - 1; i >= 0; i--) {
      int firstBit = str1.charAt(i) - '0';
      int secondBit = str2.charAt(i) - '0';

      int sum = (firstBit ^ secondBit ^ carry) + '0';

      result.insert(0, (char) sum);

      carry = (firstBit & secondBit) | (secondBit & carry) | (firstBit & carry);
    }
    if (carry == 1) {
      result.insert(0, "1");
    }

    return result.toString();
  }

  private String addBinary(String a, String b) {
    if (a == null || a.isEmpty()) {
      return b;
    } else if ((b == null) || b.isEmpty()) {
      return a;
    }

    StringBuilder stb = new StringBuilder();
    int i = a.length() - 1;
    int j = b.length() - 1;
    int aBit;
    int bBit;
    int carry = 0;
    int result;

    while (i >= 0 || j >= 0 || carry == 1) {
      aBit = (i >= 0) ? Character.getNumericValue(a.charAt(i--)) : 0;
      bBit = (j >= 0) ? Character.getNumericValue(b.charAt(j--)) : 0;
      result = aBit ^ bBit ^ carry;
      carry = ((aBit + bBit + carry) >= 2) ? 1 : 0;
      stb.append(result);
    }

    return stb.reverse().toString();
  }
}
