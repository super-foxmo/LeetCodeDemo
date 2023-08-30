package com.foxmo.leetcode.dynamic_plan.qiuzhao;


import java.util.ArrayList;
import java.util.List;

public class Demo_139_单词拆分 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak("leetcode", list));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i && !dp[i]; j++) {
                if(wordDict.contains(s.substring(j,i)) && dp[j]){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }
    
}
