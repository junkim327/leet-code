package com.company.algorithms.medium;

public class AddTwoNumbers {
  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1.val == 0 && l1.next == null) {
      return l2;
    } else if (l2.val == 0 && l2.next == null) {
      return l1;
    }

    long l1Sum = 0;
    long i = 1;
    while (l1 != null) {
      l1Sum += (long)l1.val * i;
      l1 = l1.next;
      i *= 10;
    }

    long l2Sum = 0;
    i = 1;
    while (l2 != null) {
      l2Sum += (long)l2.val * i;
      l2 = l2.next;
      i *= 10;
    }

    long sum = l1Sum + l2Sum;
    ListNode nodeSum = new ListNode((int)(sum % 10));
    sum /= 10;
    ListNode temp = nodeSum;
    while (sum > 0) {
      temp.next = new ListNode((int)(sum % 10));
      temp = temp.next;
      sum /= 10;
    }

    return nodeSum;
  }

  public static ListNode optimalAddTwoNumbers(ListNode l1, ListNode l2) {
    ListNode c1 = l1;
    ListNode c2 = l2;
    ListNode sentinel = new ListNode(0);
    ListNode d = sentinel;
    int sum = 0;
    while (c1 != null || c2 != null) {
      sum /= 10;
      if (c1 != null) {
        sum += c1.val;
        c1 = c1.next;
      }
      if (c2 != null) {
        sum += c2.val;
        c2 = c2.next;
      }
      d.next = new ListNode(sum % 10);
      d = d.next;
    }
    if (sum / 10 == 1)
      d.next = new ListNode(1);
    return sentinel.next;
  }

  public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(1);
    ListNode temp1 = l1;
    for (int i = 0; i < 10; i++) {
      temp1.next = new ListNode(1);
      temp1 = temp1.next;
    }
    //l1.next = new ListNode(4);
    //l1.next.next = new ListNode(3);
    //l1.next.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    ListNode temp2 = l2;
    for (int i = 0; i < 10; i++) {
      temp2.next = new ListNode(1);
      temp2 = temp2.next;
    }

    ListNode result = addTwoNumbers(l1, l2);
    ListNode optimalResult = optimalAddTwoNumbers(l1, l2);
    ListNode temp = result;
    while (temp != null) {
      System.out.println(temp.val);
      temp = temp.next;
    }
  }
}

