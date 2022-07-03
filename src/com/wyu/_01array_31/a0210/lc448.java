package com.wyu._01array_31.a0210;

import java.util.ArrayList;
import java.util.List;

/*
* 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。
* 请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。

示例 1：
输入：nums = [4,3,2,7,8,2,3,1]
输出：[5,6]
示例 2：
输入：nums = [1,1]
输出：[2]
* */
public class lc448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,7,2,3,1};
        Solution448 s = new Solution448();
        List<Integer> disappearedNumbers = s.findDisappearedNumbers(nums);
        for (Integer disappearedNumber : disappearedNumbers) {
            System.out.println(disappearedNumber);
        }
    }
}

class Solution448 {

    public  List<Integer> findDisappearedNumbers(int[] nums) {
//        Arrays.sort(nums);
//        int len = nums.length;
//        int[] newNums = new int[len];
//        for (int i = 1; i <= nums.length; i++) {
//            newNums[i-1] = i;
//        }
//        TreeSet<Integer> ts = new TreeSet<Integer>();
//        for (int num : nums) {
//            ts.add(num);
//        }
//        int i = 1;
//        int temp = 0;
//        List<Integer> list = new ArrayList<Integer>();
//        for (Integer t : ts) {
//            while(true){
//                if (i==t){
//                    i++;
//                    break;
//                }else {
//                    list.add(i);
//                    i++;
//                    if (i==len){
//                        break;
//                    }
//                }
//            }
//            temp = t;
//        }
//        if (list.size()==0||temp<newNums[newNums.length-1]){
//
//            for (int j = temp; j < len; j++) {
//                list.add(newNums[j]);
//            }
//        }
//        return list;
//        {4,3,2,7,7,2,3,1}
        int n = nums.length;
//        构建hash表
        for (int num : nums) {
            int x = (num-1)%n;
            nums[x] += n;
        }
//        for (int num : nums) {
//            System.out.println(num);
//        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (nums[i]<=n){
                list.add(i+1);
            }
        }
        return list;
    }
}
