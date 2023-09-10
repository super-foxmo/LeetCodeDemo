package com.foxmo.leetcode.qiuzhao.binary_tree;

import com.foxmo.leetcode.binary_tree.TreeNode;

public class Demo_104_二叉树的最大深度 {
    public static void main(String[] args) {

    }

    public static int maxDepth(TreeNode root) {
        return getMaxDepth(root);

    }

    public static int getMaxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(getMaxDepth(root.left) + 1,getMaxDepth(root.right) + 1);
    }
}
