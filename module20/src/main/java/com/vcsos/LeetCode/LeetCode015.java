package com.vcsos.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode015 {

}
/*
题目：给你一个整数数组 `nums` ，判断是否存在三元组 `[nums[i], nums[j], nums[k]]`
满足 `i != j`、`i != k` 且 `j != k` ，同时还满足 `nums[i] + nums[j] + nums[k] == 0` 。
请你返回所有和为 `0` 且不重复的三元组。
注意：**答案中不可以包含重复的三元组。
* */
class Solution015{
    public List<List<Integer>> threeSum(int[] nums){
        //用来存放结果集
        List<List<Integer>> list = new ArrayList();
        int len = nums.length;
        if(nums==null || len<3){
            return list;
        }
        Arrays.sort(nums); //排序
        for(int i=0;i<len;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int L=i+1;
            int R=len-1;
            while(L<R){
                int sum =nums[i]+nums[L]+nums[R];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while(L<R && nums[L]==nums[L+1]){
                        L++;
                    }
                    while(L<R && nums[R]==nums[R-1]){
                        R--;
                    }
                    L++;
                    R--;
                }
                else if(sum<0){
                    L++;
                }
                else if(sum>0){
                    R--;
                }
            }
        }
        return list;
    }
}