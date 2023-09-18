package com.foxmo.leetcode.qiuzhao.去哪儿旅行;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param costs int整型一维数组
     * @param coins int整型
     * @return int整型
     */
    public static int maxIceCream (int[] costs, int coins) {
        // write code here
        int[] dp = new int[coins + 1];
        for (int i = 0; i < costs.length; i++) {
            for (int j = dp.length - 1; j >= costs[i]; j--) {
                dp[j] = Math.max(dp[j],dp[j - costs[i]] + 1);
            }
        }
        return dp[coins];
    }

    public static void main(String[] args) {
        System.out.println(maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
    }
}
