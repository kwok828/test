package com.wyu._02string_27.a0220;
/*
* 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
示例 1:
输入: s = "anagram", t = "nagaram"
输出: true
示例 2:
输入: s = "rat", t = "car"
输出: false
* */
public class lc242 {
    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        Solution242 solution242 = new Solution242();
        System.out.println(solution242.isAnagram(s, t));
    }
}
class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            cnt[c-'a']--;
            if (cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}