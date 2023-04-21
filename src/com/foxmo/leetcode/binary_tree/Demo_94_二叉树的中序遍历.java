package com.foxmo.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo_94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
//        inOrder(root,list);
        inorderByIteration(root,list);
        return list;
    }

    //递归法
    public void inOrder(TreeNode root,List list){
        if (root != null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }

    //迭代法
    public void inorderByIteration(TreeNode root,List list){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while (curr != null || !stack.empty()){
                if (curr != null){
                    stack.push(curr);
                    curr = curr.left;
                } else {
                    curr = stack.pop();
                    list.add(curr.val);
                    curr = curr.right;
                }
            }
        }
    }
}
