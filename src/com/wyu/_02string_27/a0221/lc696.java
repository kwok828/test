package com.wyu._02string_27.a0221;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个字符串 s，统计并返回具有相同数量 0 和 1 的非空（连续）子字符串的数量，
* 并且这些子字符串中的所有 0 和所有 1 都是成组连续的。
重复出现（不同位置）的子串也要统计它们出现的次数。
示例 1：
输入：s = "00110011"
输出：6
解释：6 个子串满足具有相同数量的连续 1 和 0 ："0011"、"01"、"1100"、"10"、"0011" 和 "01" 。
注意，一些重复出现的子串（不同位置）要统计它们出现的次数。
另外，"00110011" 不是有效的子串，因为所有的 0（还有 1 ）没有组合在一起。
示例 2：
输入：s = "10101"
输出：4
解释：有 4 个子串："10"、"01"、"10"、"01" ，具有相同数量的连续 1 和 0 。
* */
public class lc696 {
    public static void main(String[] args) {
        String s = "10101";
        Solution696 solution696 = new Solution696();
        int cbs = solution696.countBinarySubstrings(s);

    }
}
//  计算每段连续的总数存放的集合里面，之后比较集合里面每相邻两个数最小值的和即可
class Solution696 {
    public int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<Integer>();
        int ptr = 0,n = s.length();
        while(ptr<n){
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr<n && s.charAt(ptr)==c){
                ++ptr;
                ++count;
            }
            counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); i++) {
            ans += Math.min(counts.get(i),counts.get(i-1));
        }
        return ans;
    }
}