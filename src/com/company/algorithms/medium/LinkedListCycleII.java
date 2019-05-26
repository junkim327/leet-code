package com.company.algorithms.medium;

import com.company.algorithms.ListNode;

public class LinkedListCycleII {
  public ListNode detectCycle(ListNode head) {
    ListNode tortoise = head;
    ListNode hare = head;

    while (hare != null && hare.next != null) {
      tortoise = tortoise.next;
      hare = hare.next.next;

      if (tortoise == hare) {
        hare = head;
        while (tortoise != hare) {
          hare = hare.next;
          tortoise = tortoise.next;
        }
        return hare;
      }
    }

    return null;
  }
}
