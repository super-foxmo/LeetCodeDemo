package com.foxmo.leetcode.lanqiao;

/*在数列 a[1], a[2], …, a[n] 中，如果对于下标 i, j, k 满足 0<i<j<k<n+1 且 a[i]<a[j]<a[k]，则称 a[i], a[j], a[k] 为一组递增三元组，a[j]为递增三元组的中心。
给定一个数列，请问数列中有多少个元素可能是递增三元组的中心。
【输入格式】
输入的第一行包含一个整数 n。
第二行包含 n 个整数 a[1], a[2], …, a[n]，相邻的整数间用空格分隔，表示给定的数列。
【输出格式】
输出一行包含一个整数，表示答案。
【样例输入】
5
1 2 5 3 5
【样例输出】
2
【样例说明】
a[2] 和 a[4] 可能是三元组的中心。
*/

public class Demo_20_4_6 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,3,5};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums){
        int count = 0;
        boolean left = false;
        boolean right = false;
        for (int i = 1; i < nums.length - 1; i++) {
            //判断该索引左边是否存在比它小的数
            for (int j = i - 1; j > 0; j--) {
                if (nums[j] < nums[i]){
                    left = true;
                    break;
                }
            }
            //判断该索引右边是否存在比它大的数
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]){
                    right = true;
                    break;
                }
            }
            if (left && right){
                count++;
            }
        }
        return count;
    }
}
