package com.foxmo.leetcode.string;

public class Demo_2773_左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
