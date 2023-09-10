package com.foxmo.leetcode.qiuzhao.微众银行;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        int count = 0;
        ArrayList<ArrayList<Integer>> list = getSubArrays(nums);
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> sub = list.get(i);
            int size = sub.size();
            int num = 0;
            for (int j = 0; j < size; j++) {
                num += sub.get(j);
            }
            if (num >= u && size >= v &&  num % u == 0 && size % v == 0 && num / u == size / v){
                count++;
            }
        }
        System.out.println(count);
    }

    public static ArrayList<ArrayList<Integer>> getSubArrays(int[] nums){
        int count = (int)Math.pow(2,nums.length);
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
        for (int i = 1; i < count; i++) {
            ArrayList<Integer> subarray = new ArrayList<>();
            int temp = i;
            int index = 0;
            while(temp != 0){
                if ((temp&1) == 1){
                    subarray.add(nums[index]);
                }
                index++;
                temp = temp >> 1;
            }
            arrays.add(new ArrayList<Integer>(subarray));
        }
        return arrays;
    }
}
