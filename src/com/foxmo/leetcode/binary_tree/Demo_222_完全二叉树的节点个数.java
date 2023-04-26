package com.foxmo.leetcode.binary_tree;


public class Demo_222_完全二叉树的节点个数 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null), new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null), new TreeNode(7, null, null)));

        int nodeNum = countNodes(treeNode);
        System.out.println(nodeNum);
    }

    public static int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int leftDepth = 0,rightDepth = 0;
        while (left != null){
            left = left.left;
            leftDepth++;
        }
        while(right != null){
            right = right.right;
            rightDepth++;
        }
        if (leftDepth == rightDepth){
            return (2 << leftDepth) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    //递归法
//    public int getNodesNum(TreeNode root){
//        if (root == null){
//            return 0;
//        }
//        int leftNodeNum = getNodesNum(root.left);
//        int rightNodeNum = getNodesNum(root.right);
//
//        return 1 + leftNodeNum + rightNodeNum;
//    }

}
