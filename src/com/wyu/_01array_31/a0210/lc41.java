package com.wyu._01array_31.a0210;

/*给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
示例 1：
输入：nums = [1,2,0]
输出：3
示例 2：
输入：nums = [3,4,-1,1]
输出：2
示例 3：
输入：nums = [7,8,9,11,12]
输出：1
*/

/*
* 思路:
*   先将负数排除,可以先检查负数,然后将负数置为n+1,之后判断小于等于n的加入set集合
*   对set转数组使用排序后进行判断即可,需要考虑1-n都正常,实际缺n+1
*   需要考虑全是负数
*
* */
public class lc41 {
    public static void main(String[] args) {
        int[] nums = {0,1,2};
        Solution41 s = new Solution41();
        int result = s.firstMissingPositive(nums);
        System.out.println(result);
    }
}

class Solution41 {
    public int firstMissingPositive(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (nums[i]<=0){
//                nums[i] = n + 1;
//            }
//        }
//        Set<Integer> list = new HashSet<Integer>();
//        for (int i = 0; i < n; i++) {
//            if (nums[i]<=n){
//                list.add(nums[i]);
//            }
//        }
//        if (list.size()==0){
//            return 1;
//        }
//        int[] newNums = new int[list.size()];
//        int i = 0;
//        for (Integer integer : list) {
//            newNums[i++] = integer;
//        }
//        Arrays.sort(newNums);
//        if (newNums[0]!=1){
//            return 1;
//        }
//        for (int j = 1; j < newNums.length; j++) {
//            if (newNums[j]!=(newNums[j-1]+1)){
//                return newNums[j-1]+1;
//            }
//        }
//        return newNums[newNums.length-1]+1;

//        消除小于等于0的数
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]<=0){
                nums[i] = n+1;
            }
        }
//          对小于等于n的数取负数绝对值   哈希表形式
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num<=n){
                nums[num-1] = -Math.abs(nums[num-1]);
            }
        }
//        第几个数大于0,那么那个数所在下标+1即为所缺数字,否则不缺,返回最后一位+1
        for (int i = 0; i < n; i++) {
            if (nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}