package com.wyu._01array_31.a0212;
/*
* 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
请注意 ，必须在不复制数组的情况下原地对数组进行操作。

示例 1:
输入: nums = [0,1,0,3,12]
输出: [1,3,12,0,0]
示例 2:
输入: nums = [0]
输出: [0]
* */
public class lc283 {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        Solution283 s = new Solution283();
        s.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
/*
*   思路1：判断nums[i]如果为0，那么进行元素前移之后将最后一个数置0
*        如果元素前移后nums[i]仍为0，i不变
*        如果元素前移后nums[j]仍不为0，那么j也不变，继续执行循环
*       此思路时间复杂度较高
*   思路2：使用双指针，左右都指向下标0
*   移动右，如果右非0，那么与左置换值，左下标再+1，否则不增
*   右指针下标一直+1进行值判断
* */
class Solution283 {
    public void moveZeroes(int[] nums) {
//        int j = nums.length-1;
//        int i = 0;
//        while(i<=j){
//            if (nums[i]==0){
//                for (int k = i; k < j; k++) {
//                    nums[k]=nums[k+1];
//                }
//                nums[j]=0;
//            }
//            if (nums[i]!=0){
//                i++;
//            }
//            if (nums[j]==0){
//                j--;
//            }
//        }
        int n = nums.length;
        int left = 0,right = 0;
        while(right<n){
            if(nums[right]!=0){
                swap(nums,left,right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}