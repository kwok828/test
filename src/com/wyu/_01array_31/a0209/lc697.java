package com.wyu._01array_31.a0209;

import java.util.HashMap;
import java.util.Map;

/*
* 给定一个非空且只包含非负数的整数数组nums，数组的度的定义是指数组里任一元素出现频数的最大值。
你的任务是在nums中找到与nums拥有相同大小的度的最短连续子数组，返回其长度。
* 输入：nums = [1,2,2,3,1]
输出：2
解释：
输入数组的度是 2 ，因为元素 1 和 2 的出现频数最大，均为 2 。
连续子数组里面拥有相同度的有如下所示：
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
最短连续子数组 [2, 2] 的长度为 2 ，所以返回 2 。
*
* 输入：nums = [1,2,2,3,1,4,2]
输出：6
解释：
数组的度是 3 ，因为元素 2 重复出现 3 次。
所以 [2,2,3,1,4,2] 是最短子数组，因此返回 6 。
* */
public class lc697 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        Solution697 s = new Solution697();
        System.out.println(s.findShortestSubArray(nums));
    }
}

class Solution697 {
    public int findShortestSubArray(int[] nums) {
                Map<Integer, int[]> map = new HashMap<Integer, int[]>();
                int n = nums.length;
                for (int i = 0; i < n; i++) {
                    if (map.containsKey(nums[i])) {
//                       get查询 包含key则总次数+1，2为当前位置
                        map.get(nums[i])[0]++;
                        map.get(nums[i])[2] = i;
                    } else {
//                        put添加，总次数、开始位置、结束位置
                        map.put(nums[i], new int[]{1, i, i});
                    }
                }
                int maxNum = 0, minLen = 0;
//                遍历map中每一对entry
//        当最大次数比当前entry的总次数小，赋值，并赋值长度
//        如果最大次数与当前entry的总次数相等，则判断最小长度，最小长度大于当前则需要重新赋值
                for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
                    int[] arr = entry.getValue();
                    if (maxNum < arr[0]) {
                        maxNum = arr[0];
                        minLen = arr[2] - arr[1] + 1;
                    } else if (maxNum == arr[0]) {
                        if (minLen > arr[2] - arr[1] + 1) {
                            minLen = arr[2] - arr[1] + 1;
                        }
                    }
                }
                return minLen;
            }
        }

