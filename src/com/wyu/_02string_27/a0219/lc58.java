package com.wyu._02string_27.a0219;
/*
*   给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中最后一个单词的长度。
单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
示例 1：
输入：s = "Hello World"
输出：5
示例 2：
输入：s = "   fly me   to   the moon  "
输出：4
示例 3：
输入：s = "luffy is still joyboy"
输出：6
* */
public class lc58 {
    public static void main(String[] args) {
//        String str = "   fly me   to   the moon  ";
//        String str = "luffy is still joyboy";
        String str = "a ";
        Solution58 s = new Solution58();
        int length = s.lengthOfLastWord(str);
        System.out.println(length);
    }
}
class Solution58 {
    public int lengthOfLastWord(String s) {
        if(s.length()==0){
            return 0;
        }
        int n = s.length()-1;
        while(s.charAt(n)==' '){
            n--;
        }
        int len = 0;
        while(n>=0&&s.charAt(n)!=' '){
            n--;
            len++;
        }
        return len;
    }
}
