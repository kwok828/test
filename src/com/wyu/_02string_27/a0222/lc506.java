package com.wyu._02string_27.a0222;

import java.util.Arrays;

/*
* 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i
* 位运动员在比赛中的得分。所有得分都 互不相同 。
运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，
* 名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
名次第 1 的运动员获金牌 "Gold Medal" 。
名次第 2 的运动员获银牌 "Silver Medal" 。
名次第 3 的运动员获铜牌 "Bronze Medal" 。
从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。

示例 1：
输入：score = [5,4,3,2,1]
输出：["Gold Medal","Silver Medal","Bronze Medal","4","5"]
解释：名次为 [1st, 2nd, 3rd, 4th, 5th] 。
示例 2：
输入：score = [10,3,8,9,4]
输出：["Gold Medal","5","Bronze Medal","Silver Medal","4"]
解释：名次为 [1st, 5th, 3rd, 2nd, 4th] 。
*
* score 中的所有值 互不相同
* */
public class lc506 {
    public static void main(String[] args) {
        int[] Score = {10,3,8,9,4};
        Solution506 s = new Solution506();
        String[] relativeRanks = s.findRelativeRanks(Score);
        for (String relativeRank : relativeRanks) {
            System.out.println(relativeRank);
        }
    }
}
class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int[] ints = Arrays.copyOf(score, len);
        Arrays.sort(ints);
        String[] s = new String[len];
        int left = 0;
        int right = len-1;
        while(left<=right){
            int temp = ints[left];
            ints[left] = ints[right];
            ints[right] = temp;
            left++;
            right--;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (score[i] == ints[j]){
                    if (j==0){
                        s[i] = "Gold Medal";
                        break;
                    }
                    if (j==1){
                        s[i] = "Silver Medal";
                        break;
                    }
                    if (j==2){
                        s[i] = "Bronze Medal";
                        break;
                    }
                    s[i] = new Integer(j+1).toString();
                }
            }
        }
        return s;
    }
}
