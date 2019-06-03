package com.company.algorithms.medium;

import com.company.algorithms.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {
  public List<Integer> recursiveInorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();

    helper(root, ret);

    return ret;
  }

  private void helper(TreeNode root, List<Integer> ret) {
    if (root == null) return;

    helper(root.left, ret);
    ret.add(root.val);
    helper(root.right, ret);
  }

  public List<Integer> iterativeInorderTraversal(TreeNode root) {
    List<Integer> ret = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode node = root;
    while (node != null || !stack.isEmpty()) {
      if (node != null) {
        stack.addLast(node);
        node = node.left;
      } else {
        node = stack.pollLast();
        ret.add(node.val);
        node = node.right;
      }
    }

    return ret;
  }
}
