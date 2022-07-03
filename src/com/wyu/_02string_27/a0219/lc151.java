package com.wyu._02string_27.a0219;
/*
* 给你一个字符串 s ，逐个翻转字符串中的所有 单词 。
单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
请你返回一个翻转 s 中单词顺序并用单个空格相连的字符串。
说明：
输入字符串 s 可以在前面、后面或者单词间包含多余的空格。
翻转后单词间应当仅用一个空格分隔。
翻转后的字符串中不应包含额外的空格。
 
示例 1：
输入：s = "the sky is blue"
输出："blue is sky the"
示例 2：
输入：s = "  hello world  "
输出："world hello"
解释：输入字符串可以在前面或者后面包含多余的空格，但是翻转后的字符不能包括。
* */
public class lc151 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        Solution151 s = new Solution151();
        String reverseWords = s.reverseWords(str);
        System.out.println(reverseWords);
    }
}
class Solution151 {
    public String reverseWords(String s) {
        StringBuilder sb = trimSpace(s);
        // 翻转字符串
        reverse(sb, 0, sb.length() - 1);
        // 翻转每个单词
        reverseEachWord(sb);
        return sb.toString();
    }
    public StringBuilder trimSpace(String s){
       int left = 0,right = s.length()-1;
       while(left<=right&&s.charAt(left)==' '){
           left++;
       }
        while(right>=left&&s.charAt(right)==' '){
            right--;
        }
        StringBuilder sb = new StringBuilder();
        while (left<=right){
            char c = s.charAt(left);
            if (c!=' '){
                sb.append(c);
            }else if (sb.charAt(sb.length()-1)!=' '){
                sb.append(c);
            }
            left++;
        }
        return sb;
    }
    public void reverse(StringBuilder sb, int left, int right) {
        while (left < right) {
            char tmp = sb.charAt(left);
            sb.setCharAt(left++, sb.charAt(right));
            sb.setCharAt(right--, tmp);
        }
    }

    public void reverseEachWord(StringBuilder sb) {
        int n = sb.length();
        int start = 0, end = 0;

        while (start < n) {
            // 循环至单词的末尾
            while (end < n && sb.charAt(end) != ' ') {
                ++end;
            }
            // 翻转单词
            reverse(sb, start, end - 1);
            // 更新start，去找下一个单词
            start = end + 1;
            ++end;
        }
    }
}
