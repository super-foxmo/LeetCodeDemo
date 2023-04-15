package com.foxmo.leetcode.string;

public class Demo_459_重复的子字符串 {
    public static boolean repeatedSubstringPattern(String s) {
        int[] next = getKMPNext(s);
        int len = s.length();
        if (next[len - 1] > 0 && len % (len - next[len - 1]) == 0){
            return true;
        }
        return false;
    }

    /**
     * KMP算法：计算最长相等前后缀数组
     * @param s
     * @return
     */
    public static int[] getKMPNext(String s){
        int[] next = new int[s.length()];
        //初始化
//        next[0] = 0;
        for (int i = 1,j = 0; i < s.length(); i++) {
            while(j > 0 && s.charAt(j) != s.charAt(i)){
                j = next[j - 1];
            }
            if (s.charAt(j) == s.charAt(i)){
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
