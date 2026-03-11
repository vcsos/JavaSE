package com.lvcsos.leetCode;
/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
你可以按任意顺序返回答案
* */

import java.util.HashMap;
import java.util.Map;

public class LeetCode01 {
    public static void main(String[] args) throws Exception{
        Solution01 solution01 = new Solution01();
        int[] nums = {2,7,11,15};
        int[] result = solution01.twoSum(nums,9);
        System.out.println("符合条件的下标：" + result[0] + ", " + result[1]);
    }
}

class Solution01 {
    public int[] twoSum(int[] nums, int target){
        //1.哈希表存储
        Map<Integer,Integer> map = new HashMap<>();
        //2.找target-num[i]能不能在哈希表中找到
        //3.把 “需要快速查找的内容” 作为键，把 “查找后需要获取的结果” 作为值。
        for (int i =0;i<nums.length;i++) {
            int comMath = target - nums[i];
            if (map.containsKey(comMath)) {
                return new int[]{map.get(comMath), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("无满足条件的两个数");
    }
}