package com.wyu._02string_27.a0219;
/*
* 统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
请注意，你可以假定字符串里不包括任何不可打印的字符。
示例:
输入: "Hello, my name is John"
输出: 5
解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
* */
public class lc434 {
    public static void main(String[] args) {
        String str = "Hello, my name is John";
        Solution434 s = new Solution434();
        int countSegments = s.countSegments(str);
        System.out.println(countSegments);
    }

}
class Solution434 {
    public int countSegments(String s) {
        int len = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' '){
                len++;
            }
            if (s.charAt(i)==' '||i==s.length()-1){
                if (len!=0){
                    count++;
                }
                len = 0;
            }
        }
        return count;
    }
}