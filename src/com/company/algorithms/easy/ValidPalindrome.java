package com.company.algorithms.easy;

public class ValidPalindrome {
  public static boolean isPalindrome(String s) {
    char[] sArr = s.toCharArray();
    for (int i = 0, j = sArr.length - 1; i < j; ) {
      if (!Character.isLetterOrDigit(sArr[i])) {
        i++;
      } else if (!Character.isLetterOrDigit(sArr[j])) {
        j--;
      } else if (Character.toLowerCase(sArr[i++]) != Character.toLowerCase(sArr[j--])) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String s = "";
    System.out.println(isPalindrome(s));

    String helloWorld = "helloWorLd ,,, dlrOWoLLeh";
    System.out.print(isPalindrome(helloWorld));
  }
}
