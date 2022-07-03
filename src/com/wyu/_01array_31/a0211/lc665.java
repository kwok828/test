package com.wyu._01array_31.a0211;

public class lc665 {
    public static void main(String[] args) {
        int[] nums = {1,1,4};
        Solution665 s = new Solution665();
        System.out.println(s.checkPossibility(nums));
    }
}
class Solution665 {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
            int x = nums[i],y = nums[i+1];
            if (x>y){
                nums[i] = y;
                if (isSorted(nums)){
                    return true;
                }
                nums[i] = x;
                nums[i+1] = x;
                return isSorted(nums);
            }
        }
        return true;
    }

    private boolean isSorted(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
}