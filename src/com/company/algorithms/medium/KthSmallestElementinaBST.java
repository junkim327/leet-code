package com.company.algorithms.medium;

import com.company.algorithms.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class KthSmallestElementinaBST {
  public int kthSmallest(TreeNode root, int k) {
    Deque<TreeNode> stack = new LinkedList<>();

    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.addLast(root);
        root = root.left;
      } else {
        root = stack.pollLast();
        if (--k == 0) break;
        root = root.right;
      }
    }

    return root.val;
  }
}
