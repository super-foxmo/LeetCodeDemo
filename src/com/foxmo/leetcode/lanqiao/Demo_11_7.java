package com.foxmo.leetcode.lanqiao;

/*2020 年春节期间，有一个特殊的日期引起了大家的注意：2020 年 2 月 2 日。

因为如果将这个日期按 yyyymmdd 的格式写成一个 8 位数是 20200202，恰好是一个回文数。

我们称这样的日期是回文日期。

有人表示 20200202 是“千年一遇” 的特殊日子。

对此小明很不认同，因为不到 2 年之后就是下一个回文日期：20211202 即 2021 年 12 月 2 日。

也有人表示 20200202 并不仅仅是一个回文日期，还是一个 ABABBABA 型的回文日期。

对此小明也不认同，因为大约 100 年后就能遇到下一个 ABABBABA 型的回文日期：21211212 即 2121 年 12 月 12 日。

算不上“千年一遇”，顶多算“千年两遇”。

给定一个 8 位数的日期，请你计算该日期之后下一个回文日期和下一个 ABABBABA 型的回文日期各是哪一天。

注意：下一个回文日期和下一个 ABABBABA 型的回文日期可能是同一天。

ABABBABA 型的回文日期，需要满足 A≠B。

输入格式
输入包含一个八位整数 N，表示日期。

输出格式
第一行表示下一个回文日期，
第二行表示下一个 ABABBABA 型的回文日期。

输入样例
20200202

输出样例
20211202
21211212
*/

import java.util.Scanner;

public class Demo_11_7 {
    public static final int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int date = scanner.nextInt();
        boolean flag1 = false;
        boolean flag2 = false;
        int result1 = 0;
        int result2 = 0;
        for (int i = date / 10000; i < 10000; i++) {
            int temp = i;
            int expMonDay = 0;
            //将年份颠倒
            while (temp > 0) {
                int a = temp % 10;
                expMonDay = expMonDay * 10 + a;
                temp = temp / 10;
            }
            if (i * 10000 + expMonDay <= date) {
                continue;
            }
            //判断expMonDay是否合理
            int month = expMonDay / 100;
            int day = expMonDay - month * 100;
            if (month < 1 || month > 12){
                continue;
            }
            if (day < 1 || day > getDay(i,month)){
                continue;
            }

            if (!flag1){
                result1 = i * 10000 + expMonDay;
                flag1 = true;
            }
            int c = day / 10;
            int d = day - c * 10;

            if (!flag2 && month == day && c != d){
                result2 = i * 10000 + expMonDay;
                flag2 = true;
            }

            if (flag1 && flag2){
                break;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int getDay(int year, int month) {
        if (month == 2 && LeapYear.judgeLeap(year)) {
            return days[month] + 1;
        }
        return days[month];
    }
}
