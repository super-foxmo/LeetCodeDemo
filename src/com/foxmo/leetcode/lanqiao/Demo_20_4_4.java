package com.foxmo.leetcode.lanqiao;

/*在1至2019中，有多少个数的数位中包含数字9？
注意，有的数中的数位中包含多个9，这个数只算一次。例如，1999这个数包含数字9，在计算时只是算一个数。*/

public class Demo_20_4_4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019; i++) {
            String s = new String(i + "");
            int i1 = s.indexOf("9");
            if (i1 >= 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
