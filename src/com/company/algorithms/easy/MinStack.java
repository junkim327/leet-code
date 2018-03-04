package com.company.algorithms.easy;

import java.util.Stack;

public class MinStack {
  private Stack<Integer> stack = new Stack<>();
  private int min = Integer.MAX_VALUE;

  public void push(int x) {
    if (x < min) {
      stack.push(min);
      min = x;
    }

    stack.push(x);
  }

  public void pop() {
    if (stack.pop() == min) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }

  public static void main(String[] args) {
    MinStack stack = new MinStack();
    stack.push(5);
    stack.push(18);
    stack.pop();
    stack.push(3);

    System.out.println(stack.getMin());
    stack.push(14);
    System.out.println(stack.top());
  }
}
