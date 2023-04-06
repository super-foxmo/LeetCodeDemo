package com.foxmo.leetcode.lanqiao;


public class Demo_13_山 {
    public static void main(String[] args) {
        int count = 0;
        for (long i = 2022l; i <= 2022222022; i++) {
            String s = new String(i + "");
            boolean flag = true;
            for (int j = 0; j < s.length() / 2; j++) {
                if (s.charAt(j) != s.charAt(s.length() - j - 1)){
                    flag = false;
                    break;
                }
            }
            int preIndex;
            if (flag){
                boolean flag1 = true;
                for (int j = 1; j <= s.length() / 2; j++) {
                    preIndex = j - 1;
                    if (s.charAt(preIndex) > s.charAt(j)){
                        flag1 = false;
                        break;
                    }
                }
                if (flag1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
