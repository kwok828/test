package com.wyu._01array_31.a0209;

import java.util.Arrays;

/*集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，
导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合丢失了一个数字并且有一个数字重复。
给定一个数组 nums 代表了集合 S 发生错误后的结果。
请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
输入：nums = [1,2,2,4]
输出：[2,3]

输入：nums = [1,1]
输出：[1,2]
*/
public class lc645 {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
        Solution645 s = new Solution645();
        int[] errorNums = s.findErrorNums(nums);
        for (int i = 0; i < errorNums.length; i++) {
            System.out.println(errorNums[i]);
        }
    }
}
/*
*   首先对数组进行排序
*   如果数组长度为2且两个数都是1直接返回1，2
*   如果数组第1位不是1那么判定缺少1，之后遍历相同数即可得出重复数
*   如果数组不缺1，那么先循环找出缺少的数，再遍历相同数
*   注意：相同数循环一致无需每个判断都进行，可以抽出作为共同代码
*       不缺1下缺少数可能直接缺少1-n的n，如1-10实际数组为1-9+1-9中任何一个数缺少了10
* */
class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int loseNum = 0;
        int duplicateNum = 0;

        Arrays.sort(nums);
        if (nums.length==2&&nums[1]==1){
            int[] result = {1,2};
            return result;
        }
        if (nums[0]!=1){
            loseNum=1;
        }else {
            for (int i = 0; i <= nums.length-1; i++) {

                if (i==nums.length-1||nums[i]+1!=nums[i+1]&&nums[i]!=nums[i+1]){
                    loseNum = nums[i]+1;
                    break;
                }
            }
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                duplicateNum = nums[i];
                break;
            }
        }
        int[] result = {duplicateNum,loseNum};
        return result;
    }
}