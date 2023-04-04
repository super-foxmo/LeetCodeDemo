package com.foxmo.leetcode.binary_tree;

/*给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。*/

import java.util.*;

public class Demo_102_二叉树的层序遍历 {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.add(root);
        }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }
}
