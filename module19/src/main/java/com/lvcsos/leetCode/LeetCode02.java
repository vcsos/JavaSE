package com.lvcsos.leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode02 {
    public static void main(String[] args) {
        int[] numsSu = {100,4,200,1,3,2};
        Solution02 solution02 = new Solution02();
        int result = solution02.longestConsecutive(numsSu);
        System.out.println(result);
    }
}


class Solution02 {
    public int longestConsecutive(int[] nums) {
        if (nums==null ||nums.length==0){return 0;}
        Set<Integer> set = new HashSet<>();
        //1.将数组元素方法放在哈希集合中
        for (int num:nums){
            set.add(num);
        }
        int count =0;
        //2.遍历集合中的每一个个元素，如果当前元素-1不在集合中，说明他是起点
        for (int num : set) {
            if (!set.contains(num-1)){
                //3.是起点不断向后找元素
                int currentNum = num;
                int currentLen = 1;
                //4.判断下一个元素在不在集合中
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLen++;
                }
                count=Math.max(count,currentLen);
            }
        }
        return count;
    }
}
