package com.foxmo.leetcode.binary_tree;

public class Demo_104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        return getMaxHeight(root);
    }

    //后序遍历求最大高度（根节点的最大高度 = 二叉树的最大深度）
    public int getMaxHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = getMaxHeight(root.left);
        int rightHeight = getMaxHeight(root.right);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}
