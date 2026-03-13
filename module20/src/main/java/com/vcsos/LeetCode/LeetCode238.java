package com.vcsos.LeetCode;

public class LeetCode238 {
}


class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;   // 获取数组长度
        if (len == 0) {
            return new int[0];   // 处理空数组的情况
        }
        int[] ans = new int[len]; // 存放最终结果的数组（注意原代码有误，应为 int[] ans）
        ans[0] = 1;               // 第一个元素左边没有数，左边乘积初始化为1
        int tmp = 1;               // 用于记录右边乘积的临时变量

        // 第一遍循环：计算每个位置左边所有元素的乘积，存入 ans
        for (int i = 1; i < len; i++) {
            // ans[i] 等于前一个位置的左边乘积 乘上 前一个位置的元素值
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // 第二遍循环：从右向左遍历，将右边乘积乘到 ans[i] 上
        for (int i = len - 2; i >= 0; i--) {
            // tmp 先乘上当前元素右边的第一个元素（nums[i+1]），此时 tmp 表示 i 右边所有元素的乘积
            tmp *= nums[i + 1];
            // 将右边乘积乘到 ans[i] 上，得到最终结果
            ans[i] *= tmp;
        }

        return ans; // 返回结果数组
    }
}