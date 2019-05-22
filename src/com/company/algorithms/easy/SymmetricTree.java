package com.company.algorithms.easy;

import java.util.LinkedList;

public class SymmetricTree {
  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
      val = x;
    }
  }

  public boolean isSymmetric(TreeNode root) {
    LinkedList queue = new LinkedList();
    queue.add(root);

    return true;
  }
}
