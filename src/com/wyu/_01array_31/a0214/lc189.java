package com.wyu._01array_31.a0214;

/*
* 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
*
* 输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右轮转 1 步: [7,1,2,3,4,5,6]
向右轮转 2 步: [6,7,1,2,3,4,5]
向右轮转 3 步: [5,6,7,1,2,3,4]
*
* 输入：nums = [-1,-100,3,99], k = 2
输出：[3,99,-1,-100]
解释:
向右轮转 1 步: [99,-1,-100,3]
向右轮转 2 步: [3,99,-1,-100]
*  */
public class lc189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
//        int[] nums = {-1,-100,3,99};
        Solution189 s = new Solution189();
        s.rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
class Solution189 {
    /*public void rotate(int[] nums, int k) {
        if (nums.length==0||nums.length==1){
            return;
        }
//      如果旋转次数大于数组长度，那么一次一次慢循环，否则直接进行截取拼接
        int len = nums.length;
        int[] newNums = new int[k];
        if(k>nums.length){
            int temp = 0;
            for (int i = 0; i < k; i++) {
                temp = nums[len-1];
                for (int j = len-1; j > 0; j--) {
                    nums[j] = nums[j-1];
                }
                nums[0] = temp;
            }
            return;
        }
        int[] numsa = new int[len-k];
//        取后半段
        for (int j=0,i = len-k; i < len; i++,j++) {
            newNums[j] = nums[i];
        }

//        取前半段
        for (int i = 0; i < len-k; i++) {
            numsa[i] = nums[i];
        }

//        整合后半段
        for (int i = 0;i < k;i++){
            nums[i] = newNums[i];
        }

//        整合前半段
        for (int i = k,j=0; i < len; i++,j++) {
            nums[i] = numsa[j];
        }
    }*/

//    使用数组翻转思想
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}