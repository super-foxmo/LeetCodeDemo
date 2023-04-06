package com.foxmo.leetcode.lanqiao;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_12_双向排序 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //序列长度
        int m = scanner.nextInt();  //操作次数
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        int[][] operations = new int[m][2];
        for (int i = 0; i < operations.length; i++) {
            operations[i][0] = scanner.nextInt();
            operations[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            if (operations[i][0] == 0){
                backSort(nums,0,operations[i][1] - 1);
            }else{
                Arrays.sort(nums,operations[i][1] - 1,nums.length);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }

//        int[] ints = {24,53,32,12,23,86,46,93,72,9,4};
//        backSort(ints,0,4);
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i] + "   " );
//        }
    }

    /**
     * 降序排序
     * @param nums
     */
    public static void backSort(int[] nums,int fromIndex,int toIndex){
        Arrays.sort(nums,fromIndex,toIndex + 1);

        //颠倒数组
        for (int i = fromIndex; i < (toIndex - fromIndex + 1) / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[toIndex];
            nums[toIndex] = temp;
            toIndex--;
        }
    }
}
