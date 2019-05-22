package com.company.algorithms.easy;

public class MaximumDepthOfBinaryTree {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) { val = x; }
  }

  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int maxLeft = maxDepth(root.left) + 1;
    int maxRight = maxDepth(root.right) + 1;

    return maxLeft > maxRight ? maxLeft : maxRight;
  }
}
