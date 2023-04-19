package com.foxmo.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Demo_94_二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;
    }

    public void inOrder(TreeNode root,List list){
        if (root != null){
            inOrder(root.left,list);
            list.add(root.val);
            inOrder(root.right,list);
        }
    }
}
