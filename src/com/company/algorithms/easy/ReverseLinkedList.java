package com.company.algorithms.easy;

import com.company.algorithms.ListNode;

public class ReverseLinkedList {
  public ListNode iterativeReverseList(ListNode head) {
    ListNode ret = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode temp = curr.next;
      curr.next = ret;
      ret = curr;
      curr = temp;
    }
    return ret;
  }

  public static ListNode recursionReverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode reversedListHead = recursionReverseList(head.next);
    head.next.next = head;
    head.next = null;
    return reversedListHead;
  }

  public static void main(String[] args) {
    ListNode input = new ListNode(1);
    input.next = new ListNode(2);
    input.next.next = new ListNode(3);
    input.next.next.next = new ListNode(4);
    input.next.next.next.next = new ListNode(5);
    recursionReverseList(input);
  }
}
