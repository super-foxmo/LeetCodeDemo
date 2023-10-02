package com.foxmo.leetcode.qiuzhao.slide_window;

import java.util.ArrayList;
import java.util.List;

public class Demo_658_找到K个最接近的元素 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length < k){
            return list;
        }
        int left = 0,right = k - 1;
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp += Math.abs(arr[i] - x);
        }
        min = Math.min(min,temp);
        for (int i = k; i < arr.length; i++) {
            int flag = min;
            temp = temp - Math.abs(arr[i - k] - x) + Math.abs(arr[i] - x);
            min = Math.min(min,temp);
            if (min != flag){
                left = i - k + 1;
                right = i;
            }
        }
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = findClosestElements(new int[]{1,1,1,10,10,10}, 1,9);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
