package com.foxmo.leetcode.lanqiao;

/*小蓝有很多数字卡片，每张卡片上都是数字 0 00 到 9 99。
小蓝准备用这些卡片来拼一些数，他想从 1 11 开始拼出正整数，每拼一个，就保存起来，卡片就不能用来拼其它数了。
小蓝想知道自己能从 1 11 拼到多少。
例如，当小蓝有 30 3030 张卡片，其中 0 00 到 9 99 各 3 33 张，则小蓝可以拼出 1 11 到 10 1010，但是拼 11 1111 时卡片 1 11 已经只有一张了，不够拼出 11 1111。
现在小蓝手里有 0 00 到 9 99 的卡片各 2021 20212021 张，共 20210 2021020210 张，请问小蓝可以从 1 11 拼到多少？
提示：建议使用计算机编程解决问题。
*/

import java.util.HashMap;

public class Demo_B_12_2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, 2021);
        }
        int num = 1;
        boolean flag = false;
        while (true){
            int temp = num;
            while (temp > 0) {
                int key = temp % 10;
                if (map.containsKey(key)) {
                    if (map.get(key) - 1 < 0) {
                        flag = true;
                        break;
                    }
                    map.put(key,map.get(key) - 1);
                }
                temp = temp / 10;
            }
            if (flag){
                break;
            }
            num++;
        }
        System.out.println(num - 1);
    }
}
