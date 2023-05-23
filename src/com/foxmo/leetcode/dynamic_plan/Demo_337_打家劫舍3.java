package com.foxmo.leetcode.dynamic_plan;

import com.foxmo.leetcode.dynamic_plan.entry.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_337_打家劫舍3 {
    public int rob(TreeNode root){
        int[] result = robTree(root);
        return Math.max(result[0],result[1]);
    }

    public int[] robTree(TreeNode root){
        if (root == null){
            return new int[]{0,0};
        }
        //dp[0]: 不偷当前节点的最大值   dp[1]:偷当前节点的最大值
        int[] leftdp = robTree(root.left);
        int[] rightdp = robTree(root.right);

        int val1 = Math.max(leftdp[0],leftdp[1]) + Math.max(rightdp[0],rightdp[1]); //不偷当前节点的最大值
        int val2 = root.val + leftdp[0] + rightdp[0];   //偷当前节点的最大值

        return new int[]{val1,val2};
    }
//    public int rob(TreeNode root) {
//        if (root == null){
//            return 0;
//        }
//        int rHeight = 1;
//        int lHeight = 1;
//        TreeNode rTree = root.right;
//        while (rTree != null){
//            rHeight++;
//            rTree = rTree.right == null ? rTree.left : rTree.right;
//        }
//
//        TreeNode lTree = root.left;
//        while (lTree != null){
//            lHeight++;
//            lTree = lTree.right == null ? lTree.left : lTree.right;
//        }
//
//        return Math.max(robActive(root,rHeight,true),robActive(root,lHeight,false));
//    }
//
//    public static int robActive(TreeNode root,int tHeight,Boolean flag) {
//        //初始化dp
//        int[] dp = new int[tHeight];
//        dp[0] = root.val;
//        if (flag){
//            dp[1] = Math.max(dp[0],root.right.val);
//            root = root.right;
//        }else{
//            dp[1] = Math.max(dp[0],root.left.val);
//            root = root.left;
//        }
//        root = root.right == null ? root.left : root.right;
//
//        for (int i = 2; i < dp.length && root != null; i++) {
//            dp[i] = Math.max(dp[i - 2] + root.val,dp[i - 1]);
//            root = root.right == null ? root.left : root.right;
//        }
//
//        return dp[tHeight - 1];
//    }
}
