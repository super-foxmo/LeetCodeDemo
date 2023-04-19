package com.foxmo.leetcode.stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Deno_347_前K个高频元素 {
    public static void main(String[] args) {
        int[] ans = topKFrequent1(new int[]{1, 2, 2, 3, 4, 3, 1, 1}, 2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    //解法1：基于大顶堆实现
    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();//key为数组元素值,val为对应出现次数
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //在优先队列中存储二元组(num,cnt),cnt表示元素值num在数组中的出现次数
        //出现次数按从队头到队尾的顺序是从大到小排,出现次数最多的在队头(相当于大顶堆)
        PriorityQueue<int[]> pq = new PriorityQueue<>((pair1, pair2)->pair2[1]-pair1[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){//大顶堆需要对所有元素进行排序
            pq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        int[] ans = new int[k];
        for(int i=0;i<k;i++){//依次从队头弹出k个,就是出现频率前k高的元素
            ans[i] = pq.poll()[0];
        }
        return ans;
    }
}
