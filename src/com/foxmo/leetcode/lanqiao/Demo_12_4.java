package com.foxmo.leetcode.lanqiao;

/*小蓝学习了最短路径之后特别高兴，他定义了一个特别的图，希望找到图
中的最短路径。
小蓝的图由 2021 个结点组成，依次编号 1 至 2021。
对于两个不同的结点 a, b，如果 a 和 b 的差的绝对值大于 21，则两个结点
之间没有边相连；如果 a 和 b 的差的绝对值小于等于 21，则两个点之间有一条
长度为 a 和 b 的最小公倍数的无向边相连。
例如：结点 1 和结点 23 之间没有边相连；结点 3 和结点 24 之间有一条无
向边，长度为 24；结点 15 和结点 25 之间有一条无向边，长度为 75。
请计算，结点 1 和结点 2021 之间的最短路径长度是多少。
提示：建议使用计算机编程解决问题。
*/

import java.util.Arrays;

public class Demo_12_4 {
    public static int INF = Integer.MAX_VALUE;
    public static int[][] dis=new int[2025][2025];
    public static void main(String[] args) {
        init();
        int n=2021;
        for(int len=2;len <= n;len++) {
            for(int i=1;i<= n-len+1;i++) {
                int j=i+len-1;
                for(int k=i;k<= j;k++) {
                    dis[i][j]=Math.min(dis[i][j], dis[i][k]+dis[k][j]);
                }
            }
        }
        System.out.println(dis[1][n]);

//        init();
//        for (int i = 1; i < 20; i++) {
//            for (int j = 1; j < 20; j++) {
//                System.out.print(dis[i][j] + "  ");
//            }
//            System.out.println();
//        }
    }

    private static void init() {
        // TODO Auto-generated method stub
        for(int i=0;i<2025;i++) {
            Arrays.fill(dis[i], INF);
        }
        for(int i=1;i<=2021;i++) {
            for(int j=1;j<=2021;j++) {
                if(Math.abs(i-j)>21) {
                    continue;
                }else {
                    dis[i][j]=dis[j][i]=Math.min(dis[i][j], lcm(i, j));
                }
            }
            dis[i][i]=0;
        }
    }

    /**
     * 最小公约数
     * @param num1
     * @param num2
     * @return
     */
    public static int gcd(int num1,int num2){
        return num2 == 0 ? num1 : gcd(num2,num1 % num2);
    }

    /**
     * 最小公倍数
     * @param num1
     * @param num2
     * @return
     */
    public static int lcm(int num1,int num2){
        return num1 / gcd(num1,num2) * num2;
    }
}
