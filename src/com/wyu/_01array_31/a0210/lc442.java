package com.wyu._01array_31.a0210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，
且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。
你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。

示例 1：
输入：nums = [4,3,2,7,8,2,3,1]
输出：[2,3]
示例 2：
输入：nums = [1,1,2]
输出：[1]
示例 3：
输入：nums = [1]
输出：[]
*/
public class lc442 {
    public static void main(String[] args) {
        int[] nums = {1};
        Solution442 s = new Solution442();
        List<Integer> duplicates = s.findDuplicates(nums);
        for (Integer duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
class Solution442 {
//    先对数组进行小到大的排序,如果数组长度为1那么直接返回空
//    否则进行nums[i]==nums[i-1]判断,如果存在重复数那么加入list
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        if (nums.length==1){
            return list;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]){
                list.add(nums[i]);
            }

        }
        return list;

    }
}