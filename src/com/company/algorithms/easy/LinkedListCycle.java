package com.company.algorithms.easy;

public class LinkedListCycle<T> {
  public boolean hasCycle(Node<T> head) {
    if (head == null) {
      return false;
    }
    Node<T> walker = head;
    Node<T> runner = head;
    while (runner.next != null && runner.next.next != null) {
      walker = walker.next;
      runner = runner.next.next;
      if (walker == runner) {
        return true;
      }
    }
    return false;
  }

  private static class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }
  }

  public static void main(String[] args) {
    Node<Integer> node3 = new Node<>(7, null);
    Node<Integer> node2 = new Node<>(5, node3);
    Node<Integer> node = new Node<>(3, node2);
    node3.next = node;

    LinkedListCycle<Integer> ls = new LinkedListCycle<>();
    System.out.println(ls.hasCycle(node));
  }
}


