package com.foxmo.leetcode.lanqiao;

/*题目描述
作物杂交是作物栽培中重要的一步。已知有 N 种作物 (编号 1 至 N )，第 i 种作物从播种到成熟的时间为 Ti。
作物之间两两可以进行杂交，杂交时间取两种中时间较长的一方。如作物 A 种植时间为 5 天，作物 B 种植时间为 7 天，
则 AB 杂交花费的时间为 7 天。作物杂交会产生固定的作物，新产生的作物仍然属于 N 种作物中的一种。

初始时，拥有其中 M 种作物的种子 (数量无限，可以支持多次杂交)。同时可以进行多个杂交过程。求问对于给定的目标种子，
最少需要多少天能够得到。如存在 4 种作物 A B C D，各自的成熟时间为 5 天、7 天、3 天、8 天。初始拥有 AB 两种作物的种子，
目标种子为 D，已知杂交情况为 A × B → C，A × C → D。则最短的杂交过程为：
第 1 天到第 7 天 (作物 B 的时间)，A × B → C。
第 8 天到第 12 天 (作物 A 的时间)，A × C → D。
花费 12 天得到作物 D 的种子。
输入描述
输入的第 1 行包含 4 个整数N,M,K,T，N 表示作物种类总数 (编号 11 至  N)，M 表示初始拥有的作物种子类型数量，K 表示可以杂交的方案数，T 表示目标种子的编号。
第 2 行包含 N 个整数，其中第 i 个整数表示第 i 种作物的种植时间 Ti (1 ≤ Ti ≤ 100)。
第 3 行包含  M 个整数，分别表示已拥有的种子类型 Kj (1 ≤ Kj ≤ M)， Kj 两两不同。
第 4 至  K + 3 行，每行包含 3 个整数A,B,C，表示第 A 类作物和第 B 类作物杂交可以获得第 C 类作物的种子。
其中，1 ≤ N ≤ 2000,2 ≤ M ≤ N,1 ≤ K ≤ 10^5,1 ≤ T ≤N, 保证目标种子一定可以通过杂交得到。
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _作物杂交 {
    static int N, M, K, T;
    //N表示作物种类总数 (编号1至N)，M表示初始拥有的作物种子类型数量，K表示可以杂交的方案数，T表示目标种子的编号
    static int[] Time;//其中第i个整数表示第i种作物的种植时间 T_i
    static boolean[] Had;//分别表示已拥有的种子类型
    static Map<Integer, int[]> programme;//每行包含 3 个整数 c,{a,b}，表示第 A类作物和第 B类作物杂交可以获得第 C类作物的种子。

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();//初试种类数
        K = scanner.nextInt();
        T = scanner.nextInt();
        Time = new int[N + 1];
        for (int i = 1; i < Time.length; i++) {
            Time[i] = scanner.nextInt();//每个作物的种植时间
        }
        Had = new boolean[N + 1];
        for (int i = 0; i < M; i++) {
            int temp = scanner.nextInt();//已经拥有的种子
            Had[temp] = true;
        }
        programme = new HashMap<>();
        for (int i = 0; i < K; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            programme.put(c, new int[]{a, b});
        }
        System.out.println(time(T));
    }

    public static int time(int index) {
        if (Had[index]) {
            return 0;
        } else {
            int aTime = time(programme.get(index)[0]);
            int bTime = time(programme.get(index)[1]);

            int a = Time[programme.get(index)[0]];
            int b = Time[programme.get(index)[1]];

            return Math.max(a, b) + Math.max(aTime, bTime);
        }
    }
}
