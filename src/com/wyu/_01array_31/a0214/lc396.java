package com.wyu._01array_31.a0214;

import java.util.Arrays;

/*
* 给定一个长度为 n 的整数数组 nums 。
假设 arrk 是数组 nums 顺时针旋转 k 个位置后的数组，我们定义 nums 的 旋转函数  F 为：
F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1]
返回 F(0), F(1), ..., F(n-1)中的最大值 。
生成的测试用例让答案符合 32 位 整数。
*
* 示例 1:
输入: nums = [4,3,2,6]
输出: 26
解释:
F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
示例 2:
输入: nums = [100]
输出: 0
*  */
public class lc396 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};
        Solution396 s = new Solution396();
        int maxRotateFunction = s.maxRotateFunction(nums);
        System.out.println(maxRotateFunction);
    }
}

/*
    解法1：动态规划
*   int n = nums.length;
        int[] f = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f[0] += nums[i] * i;
        }
        int ans = f[0];
        for (int i = 1; i < n; i++) {
            f[i] = f[i - 1] + sum - n * nums[n - i];
            ans = Math.max(f[i], ans);
        }
        return ans;
*
* */


//解法2   缺点时间复杂度过高，无法完成计算
class Solution396 {
    public int maxRotateFunction(int[] nums) {
        if (nums.length==1){
            return 0;
        }else {
            int[] num = new int[nums.length];
            int[] temp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                copy(nums,temp);
                if (i>0) {
                    reverse(temp, 0, temp.length - 1);
                    reverse(temp, 0, i - 1);
                    reverse(temp, i, temp.length - 1);
                }
                for (int j = 0; j < temp.length; j++) {
                    num[i] += j*temp[j];
                }
            }
            for (int i = 0; i < num.length; i++) {
                Arrays.sort(num);
                return num[num.length-1];
            }
        }
        return 0;
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
    public void copy(int[] nums,int[] temp){
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
    }
}
