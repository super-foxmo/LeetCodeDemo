package com.foxmo.leetcode.binary_tree;

public class Demo_111_二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        return getMinHeight(root);
    }
    //后序遍历求最小高度（根节点的最小高度 = 二叉树的最小深度）
    public int getMinHeight(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftHeight = getMinHeight(root.left);
        int rightHeight = getMinHeight(root.right);

        if (root.left == null && root.right != null){
            return 1 + rightHeight;
        }else if (root.left != null && root.right == null){
            return 1 + leftHeight;
        }else if (root.left != null && root.right != null){
            return 1 + Math.min(leftHeight,rightHeight);
        }else{
            return 1;
        }
    }
}
