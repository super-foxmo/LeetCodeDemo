package com.foxmo.leetcode.lanqiao;

/*小蓝要和朋友合作开发一个时间显示的网站。在服务器上，朋友已经获取了当前的时间，用一个整数表示，
值为从 1970年 1 月 1 日 00 : 00 : 00 到当前时刻经过的毫秒数。
现在，小蓝要在客户端显示出这个时间。小蓝不用显示出年月日，只需显示出时分秒即可，毫秒也不用显示，直接舍去即可。
给定一个用整数表示的时间，请将这个时间对应的时分秒输出。
*/

import java.util.Scanner;

public class Demo_B_12_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long sum = scanner.nextLong();
        Long dayMillisecond = 24 * 60 * 60 * 1000L;
        Long allSecond = sum % dayMillisecond / 1000;
        Long hour = allSecond / (60 * 60);
        Long minute = allSecond % (60 * 60) / (60);
        Long second = allSecond - hour * 60 * 60 - minute * 60;
        System.out.println(hour + ":" + minute + ":" + second);

    }
}
