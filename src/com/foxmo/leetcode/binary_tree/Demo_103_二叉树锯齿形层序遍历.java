package com.foxmo.leetcode.binary_tree;

import java.util.*;

public class Demo_103_二叉树锯齿形层序遍历 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));
        List<List<Integer>> lists = zigzagLevelOrder(treeNode);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> list = lists.get(i);
            System.out.println(list);
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        //false: 从左边开始遍历    true:从右边开始遍历
        boolean flag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (flag){
                    list.offerFirst(treeNode.val);
                }else{
                    list.offerLast(treeNode.val);
                }

                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }

            }
            lists.add(new ArrayList<Integer>(list));
            flag = !flag;
        }
        return lists;
    }
}
