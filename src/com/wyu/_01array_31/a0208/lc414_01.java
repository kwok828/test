package com.wyu._01array_31.a0208;

import java.util.Arrays;

public class lc414_01 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        Solution414 s = new Solution414();
        System.out.println(s.thirdMax(nums));
    }
}

class Solution414_01 {
    public int thirdMax(int[] nums) {
        /*TreeSet<Integer> s = new TreeSet<Integer>();
        for (int num : nums) {
            s.add(num);
            if (s.size()>3){
                s.remove(s.first());
            }
        }
        return s.size()==3?s.first():s.last();*/
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        int diff=1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1]&&++diff==3){
                return nums[i];
            }
        }
        return diff==3?nums[left]:nums[right];
    }
}