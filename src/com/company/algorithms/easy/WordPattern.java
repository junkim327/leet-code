package com.company.algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
  public static boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    if (pattern.length() != words.length) {
      return false;
    }
    HashMap<Object, Object> index = new HashMap<>();
    for (Integer i = 0; i < words.length; ++i) {
      if (index.put(pattern.charAt(i), i) != index.put(words[i], i)) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(wordPattern("abba", "dog cat cat dog"));
    System.out.println(wordPattern("abba", "dog cat cat fish"));
    System.out.println(wordPattern("aaaa", "dog cat cat dog"));
    System.out.println(wordPattern("abba", "dog dog dog dog"));
  }
}
