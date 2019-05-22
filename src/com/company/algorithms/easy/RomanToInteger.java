package com.company.algorithms.easy;

public class RomanToInteger {
  public static int romanToInt(String s) {
    int result = 0;
    char[] romanArray = s.toCharArray();
    for (int i = 0; i < romanArray.length; i++) {
      if (romanArray[i] == 'I') {
        if ((i + 1) < romanArray.length && romanArray[i + 1] == 'V') {
          i++;
          result += 4;
        } else if ((i + 1) < romanArray.length && romanArray[i + 1] == 'X') {
          i++;
          result += 9;
        } else {
          result += 1;
        }
      } else if (romanArray[i] == 'V') {
        result += 5;
      } else if (romanArray[i] == 'X') {
        if ((i + 1) < romanArray.length && romanArray[i + 1] == 'L') {
          i++;
          result += 40;
        } else if ((i + 1) < romanArray.length && romanArray[i + 1] == 'C') {
          i++;
          result += 90;
        } else {
          result += 10;
        }
      } else if (romanArray[i] == 'L') {
        result += 50;
      } else if (romanArray[i] == 'C') {
        if ((i + 1) < romanArray.length && romanArray[i + 1] == 'D') {
          i++;
          result += 400;
        } else if ((i + 1) < romanArray.length && romanArray[i + 1] == 'M') {
          i++;
          result += 900;
        } else {
          result += 100;
        }
      } else if (romanArray[i] == 'D') {
        result += 500;
      } else if (romanArray[i] == 'M') {
        result += 1000;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String roman = "MCMXCIV";
    int result = romanToInt(roman);
    System.out.print(result);
  }
}
