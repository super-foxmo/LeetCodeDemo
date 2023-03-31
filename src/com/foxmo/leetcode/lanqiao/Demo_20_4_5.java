package com.foxmo.leetcode.lanqiao;

/*【问题描述】
一个正整数如果任何一个数位不大于右边相邻的数位，则称为一个数位递增的数，例如1135是一个数位递增的数，而1024不是一个数位递增的数。
给定正整数 n，请问在整数 1 至 n 中有多少个数位递增的数？
【输入格式】
输入的第一行包含一个整数 n。
【输出格式】
输出一行包含一个整数，表示答案。
【样例输入】
30
【样例输出】
26
【评测用例规模与约定】
对于 40% 的评测用例，1 <= n <= 1000。
对于 80% 的评测用例，1 <= n <= 100000。
对于所有评测用例，1 <= n <= 1000000。
*/

public class Demo_20_4_5 {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }

    public static int solution(int num){
        int count = 0;
        int flag = 0;
        if(num >= 10){
            count = 9;
        }
        for (int i = 10; i <= num; i++) {
            flag = 1;
            String str = new String(i + "");
            for (int j = 0; j < str.length() - 1; j++) {
                if (str.charAt(j) > str.charAt(j+1)){
                    flag = 0;
                    break;
                }
            }
            if (flag == 1){
                count++;
            }
        }
        return count;
    }
}
