package com.foxmo.leetcode.qiuzhao.xiaomi;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        String str = scan.next();
        String[] strs = str.split(",");
        LinkedHashMap<Integer,Double> goods = new LinkedHashMap<>();
        for(int i =0;i < strs.length;i++){
            String[] freq = strs[i].split(":");
            goods.put(Integer.valueOf(freq[0]),Double.valueOf(freq[1]));
        }
        Double result = solution(target, goods);
        BigDecimal bigDecimal = new BigDecimal(result);
        double value = bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(value);
    }

    public static Double solution(int target,LinkedHashMap<Integer,Double> goods){
        int index = 0;
        Set<Map.Entry<Integer, Double>> entries = goods.entrySet();
        for (Map.Entry<Integer, Double> entry : entries) {
            if (entry.getKey() == target){
                return entry.getValue();
            } else if(entry.getKey() < target){
                index++;
            }
        }
        int i =0;
        Double num1 = 0.0,num2 = 0.0;
        int s1 = 0,s2 = 0;
        for (Map.Entry<Integer, Double> entry : entries) {
            if (index == 0){
                return entry.getValue();
            }
            if (i == index - 1){
                s1 = target - entry.getKey();
                num1 = entry.getValue();
            }
            if (i == index){
                s2 = entry.getKey() - target;
                num2 = entry.getValue();
            }
        }
        if (s1 < s2){
            return num1;
        } if (s1 > s2){
            return num2;
        }
        return (s1 + s2) / 2.0;
    }

}
