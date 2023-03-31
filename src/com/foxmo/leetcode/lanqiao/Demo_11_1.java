package com.foxmo.leetcode.lanqiao;

/*A门牌制作*/


public class Demo_11_1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2020; i++) {
            int x = i;//定义一个变量x 替换i ，防止发生死循环
            while (x > 0) {
                if (x % 10 == 2) {//模10检查每一位是否为2，为2的话，计数器count+1
                    count++;
                }
                x = x / 10;//x的位数减1，带入到下一次while循环中
            }
        }
        System.out.println(count);//运行结果为624
    }
}
