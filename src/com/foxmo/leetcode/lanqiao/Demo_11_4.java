package com.foxmo.leetcode.lanqiao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo_11_4 {
    static int ans = 0;
    static boolean[] map;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        DFS(new boolean[7], 0);
        System.out.println(set.size());
    }

    private static void DFS(boolean[] rec, int k) {
        // TODO 当前第k位置是否亮
        if (k == rec.length) {
            if (check(rec)) { // 当前组合的等符合要求
                if (!set.contains(rec)) {
                    for (boolean i : rec) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    set.add(Arrays.copyOf(rec, rec.length).toString());
                    ans++;
                }

            }
            return;
        }
        rec[k] = true;
        DFS(rec, k + 1);
        rec[k] = false;
        DFS(rec, k + 1);

    }

    private static boolean check(boolean[] rec) {
        // TODO 判断是否符合要求
        int count1 = 0;
        for (boolean t : rec) {
            if (t) {
                count1++;
            }
        }
        if (count1 == 0)
            return false;
        boolean[][] vis = new boolean[7][7];
        vis[0][1] = vis[1][2] = vis[1][6] = vis[2][3] = vis[2][6] = vis[3][4] = vis[4][6] = vis[4][5] = vis[5][6] = vis[5][0] = true;
        vis[1][0] = vis[2][1] = vis[6][1] = vis[3][2] = vis[6][2] = vis[4][3] = vis[6][4] = vis[5][4] = vis[6][5] = vis[0][5] = true;
        // 判断rec是否连通
        boolean[][] arr = new boolean[rec.length][rec.length];
        for (int i = 0; i < rec.length; i++) {
            if (rec[i]) {
                arr[i][i] = true;
            }
            for (int j = 0; j < rec.length; j++) {
                if ((vis[i][j] && rec[i] && rec[j])) {
                    arr[i][j] = arr[j][i] = true;
                }
            }
        }
        int count = 0;
        map = new boolean[rec.length];
        f1: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]) {
                    connecte(arr, i);
                    break f1;
                }
            }
        }
        int count2 = 0;
        for (boolean t : map) {
            if (t) {
                count2++;
            }
        }
        if (count1 == count2) {
            return true;
        }
        return false;
    }

    private static void connecte(boolean[][] arr, int x) {
        // TODO 判断连通块
        map[x] = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[x][i] && !map[i]) {
                connecte(arr, i);
            }
        }

    }
}
