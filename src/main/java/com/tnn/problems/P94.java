package com.tnn.problems;

import com.tnn.lib.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P94 {
    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node != null) {
            traverse(node.left, result);
            result.add(node.val);
            traverse(node.right, result);
        }
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);

            curr = curr.right;
        }

        return  result;
    }
}
