package com.wyu._02string_27.a0218;
/*
* 我们定义，在以下情况时，单词的大写用法是正确的：
全部字母都是大写，比如 "USA" 。
单词中所有字母都不是大写，比如 "leetcode" 。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
*
* 输入：word = "USA"
输出：true
*
* 输入：word = "FlaG"
输出：false
*
* 65 90   97 122
* */
public class lc520 {
    public static void main(String[] args) {
        String word = "USa";
        Solution520 s = new Solution520();
        boolean b = s.detectCapitalUse(word);
        System.out.println(b);
    }

}
class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word.length()==1){
            return true;
        }
        if (word.charAt(0)>=65 && word.charAt(0)<=90){
            if (word.charAt(1)>=65 && word.charAt(1)<=90){
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i)>=65 && word.charAt(i)<=90){
                        continue;
                    }else {
                        return false;
                    }
                }
                return true;
            }else {
                for (int i = 2; i < word.length(); i++) {
                    if (word.charAt(i)>=65 && word.charAt(i)<=90){
                        return false;
                    }
                }
            }
        }
        if (word.charAt(0)>=97 && word.charAt(0)<=122){
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) >= 65 && word.charAt(i) <= 90){
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}