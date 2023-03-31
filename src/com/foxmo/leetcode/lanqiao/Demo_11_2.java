package com.foxmo.leetcode.lanqiao;

/*如果一个分数的分子和分母的最大公约数是1,这个分数称为既约分数。例如，4/3,1/2,1/7,8/1都是既约分数。
请问，有多少个既约分数，分子和分母都是1到2020之间的整数（包括1和2020)?*/

public class Demo_11_2 {
    public static void main(String[] args) {
        int count = 2020 * 2020;
        for (int i = 1; i <= 2020; i++) {
            for (int j = 1; j <= 2020; j++) {
                int min = i < j ? i : j;
                for (int k = 2; k <= min; k++) {
                    if (i % k == 0 && j % k == 0){
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
