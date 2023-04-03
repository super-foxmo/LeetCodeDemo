package com.foxmo.leetcode.lanqiao;

/*对于一棵多叉树，我们可以通过 “左孩子右兄弟” 表示法，将其转化成一棵二叉树。如果我们认为每个结点的子结点是无序的，
那么得到的二叉树可能不唯一。换句话说，每个结点可以选任意子结点作为左孩子，并按任意顺序连接右兄弟。
给定一棵包含 N 个结点的多叉树，结点从 1 至 N 编号，其中 1 号结点是根，每个结点的父结点的编号比自己的编号小。
请你计算其通过 “左孩子右兄弟” 表示法转化成的二叉树，高度最高是多少。注：只有根结点这一个结点的树高度为 0 。
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_12_7 {
    public static ArrayList<Integer>[] lists;
    public static int ans = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();

        lists = new ArrayList[sum + 10];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList();
        }

        for (int i = 2; i <= sum; i++) {
            int t = scanner.nextInt();
            lists[t].add(i);
        }

        dfs(0,1);
        System.out.println(ans);
    }

    public static void dfs(int total, int father) {
        int size = lists[father].size();
        if (size == 0) {
            ans = Math.max(ans, total);
        }
        for (int p : lists[father]) {
            dfs(total + size, p);
        }
    }
}
