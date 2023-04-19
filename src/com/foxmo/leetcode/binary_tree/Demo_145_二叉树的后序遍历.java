package com.foxmo.leetcode.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class Demo_145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(root,list);
        return list;
    }

    public void postOrder(TreeNode root,List list){
        if (root != null){
            postOrder(root.left,list);
            postOrder(root.right,list);
            list.add(root.val);
        }
    }
}
