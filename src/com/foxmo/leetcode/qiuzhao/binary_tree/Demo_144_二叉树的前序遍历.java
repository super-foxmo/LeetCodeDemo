package com.foxmo.leetcode.qiuzhao.binary_tree;

import com.foxmo.leetcode.binary_tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Demo_144_二叉树的前序遍历 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList list = new ArrayList<Integer>();
        preOrderRecur(root,list);
        return list;
    }

    public static void preOrderRecur(TreeNode root,ArrayList list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrderRecur(root.left,list);
        preOrderRecur(root.right,list);
    }


}
