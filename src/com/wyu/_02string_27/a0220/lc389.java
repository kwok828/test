package com.wyu._02string_27.a0220;

/*
* 给定两个字符串 s 和 t ，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。

示例 1：
输入：s = "abcd", t = "abcde"
输出："e"
解释：'e' 是那个被添加的字母。
示例 2：
输入：s = "", t = "y"
输出："y"
* */
public class lc389 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abecd";
//        String s = "ae";
//        String t = "aea";
        Solution389 solution389 = new Solution389();
        char difference = solution389.findTheDifference(s, t);
        System.out.println(difference);
    }
}
class Solution389 {
    public char findTheDifference(String s, String t) {
//        char[] sChars = s.toCharArray();
//        char[] tChars = t.toCharArray();
//        Arrays.sort(sChars);
//        Arrays.sort(tChars);
//        for (int i = 0; i < sChars.length; i++) {
//            if (sChars[i]!=tChars[i]){
//                return tChars[i];
//            }
//        }
//        return tChars[tChars.length-1];
        int as = 0,at = 0;
        for (int i = 0; i < s.length(); i++) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            at += t.charAt(i);
        }
        return (char)(at-as);
    }
}
