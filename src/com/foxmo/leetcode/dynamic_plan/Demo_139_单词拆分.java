package com.foxmo.leetcode.dynamic_plan;

import java.util.Arrays;
import java.util.List;

public class Demo_139_单词拆分 {
    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        //初始化dp
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = false;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                for (String word : wordDict) {
                    if (word.equals(s.substring(j,i)) && dp[j])
                        dp[i] = true;
                }
            }
        }

        return dp[s.length();
    }
}
