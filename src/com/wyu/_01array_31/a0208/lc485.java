package com.wyu._01array_31.a0208;

public class lc485 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        Solution s = new Solution();
        int maxConsecutiveOnes = s.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
    }
}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
//        count 统计1的个数，max做比较值，遍历结束返回为最终得出最大连续数
        int count = 0;
        int max = 0;
//        nums[i]为1则count自增，否则连续1中断，开始进行比较
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                count++;
                continue;
            }else{
                max = (max<count)?count:max;
                count = 0;
                continue;
            }
        }
//        若最后为1，会直接跳过判断结束循环，需要再进行一次比较
        max = (max<count)?count:max;
        return max;
    }
}