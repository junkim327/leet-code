package com.company.algorithms.medium;

import com.company.algorithms.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateBinarySearchTree {
  public static boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode pre = null;

    while (root != null || !stack.isEmpty()) {
      if (root != null) {
        stack.addLast(root);
        root = root.left;
      } else {
        root = stack.pollLast();
        if(pre != null && root.val <= pre.val) return false;
        pre = root;
        root = root.right;
      }
    }

    return true;
  }

  public static boolean recursiveIsValidBst(TreeNode root) {
    return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private static boolean helper(TreeNode node, long lowerLimit, long upperLimit) {
    if (node == null) {
      return true;
    }

    if (node.val <= lowerLimit || node.val >= upperLimit) {
      return false;
    }

    return helper(node.left, lowerLimit, node.val) && helper(node.right, node.val, upperLimit);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(7);
    root.left = new TreeNode(8);
    root.left.left = new TreeNode(3);
    root.left.right = new TreeNode(6);
    root.right = new TreeNode(10);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(11);

    System.out.print(isValidBST(root));
  }
}
