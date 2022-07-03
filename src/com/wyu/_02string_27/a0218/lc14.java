package com.wyu._02string_27.a0218;
/*
* 编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1：
输入：strs = ["flower","flow","flight"]
输出："fl"
示例 2：
输入：strs = ["dog","racecar","car"]
输出：""
解释：输入不存在公共前缀。
* */
public class lc14 {
    public static void main(String[] args) {
//        String[] strs = {"flower","flow","flight"};
        String[] strs = {"cir","car"};
//        String[] strs = {"dog","racecar","car"};
        Solution14 s = new Solution14();
        String str = s.longestCommonPrefix(strs);
        System.out.println(str);
    }
}
class Solution14 {
    public String longestCommonPrefix(String[] strs) {
//        字符串数组长度为1直接返回
        if (strs.length==1){
            return strs[0];
        }
        StringBuffer sb = new StringBuffer();
        int min = strs[0].length();
//        取字符串数组中字符串最短长度
        for (int i = 1; i < strs.length; i++) {
            min = min<strs[i].length()?min:strs[i].length();
        }
        boolean flag = false;
//        进行比较首字符开始，轮流比较每个字符串，如果当前字符串为最后一个那么获取该相同字符
//        如果不同，那么直接退出比较
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i)==strs[j-1].charAt(i)){
                    if (j==strs.length-1){
                        sb.append(strs[j].charAt(i));
                    }
                    continue;
                }else {
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
//        如果长度为0返回空串，否则返回字符串
        if (sb.length()!=0){
            return sb.toString();
        }
        return "";
    }
}