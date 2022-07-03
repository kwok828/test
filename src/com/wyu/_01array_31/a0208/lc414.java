package com.wyu._01array_31.a0208;

public class lc414 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        Solution414 s = new Solution414();
        System.out.println(s.thirdMax(nums));
    }
}
class Solution414 {
    public int thirdMax(int[] nums) {

//        求第三大，直接使用三个数表示最大，第二大，第三大，返回第三个数即可
        int first = 0;
        int second = 0;
        int third = 0;
//        先判断数组长度，小于2的返回最大值，否则遍历数组，对三个数进行赋值比较
//        3个数直接使用三元进行判断
        if (nums.length==1){
            return nums[0];
        }else if (nums.length==2){
            return nums[0]>nums[1]?nums[0]:nums[1];
        }else if (nums.length==3){
            if (nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]){
                third = nums[0]<nums[1]?nums[0]:nums[1];
                third = third<nums[2]?third:nums[2];
            }else{
                third = nums[0]>nums[1]?nums[0]:nums[1];
                third = third>nums[2]?third:nums[2];
            }
        }else {
            first = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i]==first||nums[i]==second){
                    continue;
                }
                if (nums[i]>first){
                    third = second;
                    second = first;
                    first = nums[i];
                }else if(nums[i]>second){
                    third = second;
                    second = nums[i];
                }else if(nums[i]>third){
                    third = nums[i];
                }
            }
        }
        return third;
    }
}