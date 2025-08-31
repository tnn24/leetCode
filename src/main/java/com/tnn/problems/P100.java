package com.tnn.problems;

import com.tnn.lib.TreeNode;

public class P100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q == null || p == null && q != null || p != null && p.val != q.val) {
            return false;
        }
        if (p != null)  {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return true;
    }
}
