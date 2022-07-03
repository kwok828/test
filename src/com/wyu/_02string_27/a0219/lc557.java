package com.wyu._02string_27.a0219;
/*
* 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
示例 1：
输入：s = "Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"
示例 2:
输入： s = "God Ding"
输出："doG gniD"
* */
public class lc557 {
    public static void main(String[] args) {
        String str = "God Ding";
        Solution557 s = new Solution557();
        String reverseWords = s.reverseWords(str);
        System.out.println(reverseWords);
    }
}
//先将字符串转数组，当前字符为空或者为最后一位字符进行反转
class Solution557 {
    public String reverseWords(String s) {
        int len = s.length();
        char[] chars = s.toCharArray();
        int left = 0,right = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i]==' '||i==len-1){
                if (i==len-1){
                    reverse(chars,left,i);
                }else{
                    reverse(chars,left,i-1);
                }
                left = i+1;
            }
        }
        return new String(chars);
    }
    public void reverse(char[] chars,int left,int right){
        while(left<=right){
            char temp = chars[left];
            chars[left] =  chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}