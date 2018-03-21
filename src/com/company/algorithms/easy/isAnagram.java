package com.company.algorithms.easy;

public class isAnagram {
  public static boolean isAnagram(String s, String t) {
    int[] alpahbet = new int[26];
    for (int i = 0; i < s.length(); i++) {
      alpahbet[s.charAt(i) - 'a']++;
    }
    for (int j = 0; j < t.length(); j++) {
      alpahbet[t.charAt(j) - 'a']--;
      if (alpahbet[t.charAt(j) - 'a'] < 0) {
        return false;
      }
    }
    for (int a : alpahbet) {
      if (a != 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    String s1 = "ellho";
    String s2 = "hello";
    System.out.println(isAnagram(s1, s2));
  }
}
