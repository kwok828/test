package com.wyu._01array_31.a0209;

import java.util.Arrays;

//给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
public class lc628 {
    public static void main(String[] args) {
        int[] nums = {-4,-2,2,4};
        Solution628 s = new Solution628();
        System.out.println(s.maximumProduct(nums));
    }

}
/*  具体实现
*   注意：本题数组中可能包含负数，需要考虑一下情况
*   1、数组个数小于3
*   2、数组长度为3直接返回
*   3、数组长度大于3需要判断负数个数
*       负数个数为1返回三个正整数的乘积即可
*       负数个数大于2则需要判断最小的两个负数与最大正数乘积 和 前三个正数乘积 的大小
*       返回最大那个即可
* */
class Solution628 {
    public int maximumProduct(int[] nums) {
        int flagz = 0;
        int flagf = 0;
        int resultf = 0;
        int resultz = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                flagz++;
            }else flagf++;
        }
        Arrays.sort(nums);
        resultf = nums[0]*nums[1]*nums[nums.length-1];
        resultz = nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        if (nums.length<3)
            System.out.println("error");
        else if (nums.length==3)
            return nums[0]*nums[1]*nums[2];
        else if (flagf>1){
            return resultf>resultz?resultf:resultz;
        }else return resultz;
        return resultz;

//        也可以排序后直接返回,无需做其他的判断
//        return resultf>resultz?resultf:resultz;
    }
}