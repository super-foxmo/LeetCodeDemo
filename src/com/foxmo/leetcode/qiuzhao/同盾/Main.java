package com.foxmo.leetcode.qiuzhao.同盾;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        String[] strs = new String[sum];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        int count = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (isPass(strs[i],list)){
                count++;
                list.add(strs[i]);
            }
        }
        System.out.println(count);
    }

    public static boolean isPass(String s,List<String> list){
        boolean flag = false;
        int len = s.length();
        for (String s1 : list) {
            if (s1.length() == len){
                for (int i = 0; i < len; i++) {
                    if (s1.contains(s.charAt(i) + "")){
                        s1.replaceFirst(s.charAt(i) + "","");
                        if (i == len - 1){
                            flag = true;
                        }
                    } else{
                        break;
                    }
                }
            }
            if (flag){
                break;
            }
        }
        return !flag;
    }
}
