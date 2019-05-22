package com.company.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
  public static int minimumTotal(List<List<Integer>> triangle) {
    int minimumSum = 0;
    if (triangle.size() == 0) {
      return minimumSum;
    } else if (triangle.size() == 1) {
      minimumSum = triangle.get(0).get(0);
      return minimumSum;
    }

    int stepIndex = 0;
    for (List<Integer> row : triangle) {
      int minimumStep = Integer.MAX_VALUE;
      int lowerBound = stepIndex - 1;
      int upperBound = stepIndex + 1;
      if (stepIndex - 1 == -1) {
        lowerBound = 0;
      }
      if (stepIndex + 1 == row.size()) {
        upperBound = stepIndex;
      }
      for (int i = lowerBound; i <= upperBound; i++) {
        if (row.get(i) < minimumStep) {
          minimumStep = row.get(i);
          stepIndex = i;
        }
      }
      minimumSum += minimumStep;
    }

    return minimumSum;
  }

  public static void main(String[] args) {
    List<List<Integer>> triangle = new ArrayList<>();

    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(-1);
    List<Integer> secondRow = new ArrayList<>();
    secondRow.add(2);
    secondRow.add(3);
    List<Integer> thirdRow = new ArrayList<>();
    thirdRow.add(1);
    thirdRow.add(-1);
    thirdRow.add(-3);

    triangle.add(firstRow);
    triangle.add(secondRow);
    triangle.add(thirdRow);

    System.out.println(minimumTotal(triangle));
  }
}
