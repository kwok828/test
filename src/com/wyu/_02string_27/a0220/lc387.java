package com.wyu._02string_27.a0220;

import java.util.HashMap;
import java.util.Map;

/*
* 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
示例 1：
输入: s = "leetcode"
输出: 0
示例 2:
输入: s = "loveleetcode"
输出: 2
示例 3:
输入: s = "aabb"
输出: -1
* */
public class lc387 {
    public static void main(String[] args) {
//        String str =  "leetcode";
//        String str =  "loveleetcode";
        String str =  "aabb";
//        String str =  "a";
        Solution387 s = new Solution387();
        int firstUniqChar = s.firstUniqChar(str);
        System.out.println(firstUniqChar);
    }
}
class Solution387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> position = new HashMap<Character, Integer>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (position.containsKey(c)){
                position.put(c,-1);
            }else {
                position.put(c,i);
            }
        }
        int first = len;
        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            int pos = entry.getValue();
            if (pos != -1 &&pos<first){
                first = pos;
            }
        }
        if (first==len){
            return -1;
        }
        return first;
    }
}