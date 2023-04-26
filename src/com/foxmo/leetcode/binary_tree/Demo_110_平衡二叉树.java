package com.foxmo.leetcode.binary_tree;

public class Demo_110_平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        if (getHeight(root) >= 0){
            return true;
        }
        return false;
    }

    public int getHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        if (leftHeight == -1){
            return -1;
        }
        int rightHeight = getHeight(root.right);
        if (rightHeight == -1){
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
