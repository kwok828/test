package com.wyu._01array_31.a0218;
/*
*  给你一个整数数组 nums，返回 数组 answer ，
* 其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
请不要使用除法，且在 O(n) 时间复杂度内完成此题
*
* 输入: nums = [1,2,3,4]   [1,1,2,6]  [24,12,4,1]
输出: [24,12,8,6]
* 输入: nums = [-1,1,0,-3,3]
输出: [0,0,9,0,0]

* */
public class lc238 {
}
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] l = new int[len];
        int[] r = new int[len];
        int[] answer = new int[len];
        l[0] = 1;
        r[len-1] = 1;
        for (int i = 1; i < len; i++) {
            l[i] = nums[i-1]*l[i-1];
        }
        for (int i = len-2; i >= 0; i--) {
            r[i] = nums[i+1]*r[i+1];
        }
        for (int i = 0; i < len; i++) {
            answer[i] = l[i]*r[i];
        }
        return answer;
    }
}