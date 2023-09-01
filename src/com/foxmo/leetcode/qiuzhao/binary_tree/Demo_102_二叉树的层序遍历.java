package com.foxmo.leetcode.qiuzhao.binary_tree;

import com.foxmo.leetcode.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo_102_二叉树的层序遍历 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        queue.offer(root);
        while(queue.size() > 0){
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (TreeNode treeNode : queue) {
                arrayList.add(treeNode.val);
            }
            list.add(arrayList);
            ArrayList<TreeNode> treeNodeList = new ArrayList<>();
            for (TreeNode treeNode : queue) {
                treeNodeList.add(treeNode);
            }
            queue.clear();
            for (TreeNode treeNode : treeNodeList) {
                if (treeNode.left != null){
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null){
                    queue.offer(treeNode.right);
                }
            }
        }
        return list;
    }
}
