package com.foxmo.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo_144_二叉树的前序遍历 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3,new TreeNode(1,null,null),new TreeNode(2,null,null));
        List<Integer> list = preorderTraversal(treeNode);
        for (Integer i : list){
            System.out.print(i + " ");
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
//        preorder(root,result);
        preorderByIteration(root,result);
        return result;
    }

    //递归法
    public void preorder(TreeNode root,List list){
        if (root != null){
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        }
    }

    //迭代法
    public static void preorderByIteration(TreeNode root,List list){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode temp;
            while (!stack.empty()){
                temp = stack.pop();
                list.add(temp.val);
                if (temp.right != null){
                    stack.push(temp.right);
                }
                if (temp.left != null){
                    stack.push(temp.left);
                }
            }
        }
    }
}
