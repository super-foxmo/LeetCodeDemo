package com.foxmo.leetcode.string;

public class Demo_28_字符串中第一个匹配项的下标 {
    public static void main(String[] args) {
        int[] next = getKMPNext("aabaaf");
        for (int i = 0; i < next.length; i++) {
            System.out.print(next[i] + " ");
        }
    }
    public int strStr(String haystack, String needle) {
        int[] next = getKMPNext(needle);
        int index = 0;
        for (int i = 0; i < haystack.length(); i++) {
            while(index > 0 && needle.charAt(index) != haystack.charAt(i)){
                index = next[index - 1];
            }
            if (needle.charAt(index) == haystack.charAt(i)){
                if (index == needle.length() - 1){
                    return i - index;
                }
                index++;
            }
        }
        return -1;
    }

    /**
     * KMP算法：计算最长相等前后缀
     * @param s
     * @return
     */
    public static int[] getKMPNext(String s){
        int[] next = new int[s.length()];
        //初始化
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < s.length(); i++) {
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
