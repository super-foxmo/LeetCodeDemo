package com.foxmo.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Demo_145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
//        postOrder(root,list);
        postOrderByIteration(root,list);
        return list;
    }

    public void postOrder(TreeNode root,List list){
        if (root != null){
            postOrder(root.left,list);
            postOrder(root.right,list);
            list.add(root.val);
        }
    }

    // 先序遍历（中左右） --> 后序遍历（左右中）
    // 1. 先序遍历调整左右顺序（中右左）
    // 2. 翻转链表（左右中） --> 后序遍历
    public void postOrderByIteration(TreeNode root,List list){
        if (root != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            TreeNode temp;
            while(!stack.empty()){
                temp = stack.pop();
                list.add(temp.val);
                if (temp.left != null){
                    stack.push(temp.left);
                }
                if (temp.right != null){
                    stack.push(temp.right);
                }
            }
            //翻转链表
            reversal(list);
        }
    }

    //翻转链表
    public void reversal(List list){
        int size = list.size();
        Integer temp;
        for (int i = 0; i < size / 2; i++) {
            temp = (Integer) list.get(i);
            list.set(i,list.get(size - 1 - i));
            list.set(size - 1 - i,temp);
        }
    }
}
