package com.foxmo.leetcode.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_15_三数之和 {
    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left,right;
        ArrayList<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){    //对a去重
                continue;
            }
            left = i + 1;
            right = nums.length - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum < 0){
                    left++;
                }else if (sum > 0){
                    right--;
                }else if (sum == 0){
                    lists.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // 去重逻辑应该放在找到一个三元组之后，对b 和 c去重
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return lists;
    }
}
