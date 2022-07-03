package com.wyu._02string_27.a0221;
/*
* 给你一个字符串 s 表示一个学生的出勤记录，
* 其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
'A'：Absent，缺勤
'L'：Late，迟到
'P'：Present，到场
如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
按 总出勤 计，学生缺勤（'A'）严格 少于两天。
学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。

示例 1：
输入：s = "PPALLP"
输出：true
解释：学生缺勤次数少于 2 次，且不存在 3 天或以上的连续迟到记录。
示例 2：
输入：s = "PPALLL"
输出：false
解释：学生最后三天连续迟到，所以不满足出勤奖励的条件。
* */
public class lc551 {
    public static void main(String[] args) {
        String s = "ALL";
        Solution551 solution551 = new Solution551();
        boolean b = solution551.checkRecord(s);
        System.out.println(b);
    }
}
//
//  只需要判断字符串中A等于2即无法获取奖励
//  或者三个连续L，即i-1 = i = i+1 = L那么无法获取奖励，注意此式子1<=i<=length-2;
class Solution551 {
    public boolean checkRecord(String s) {
        int length = s.length();
        int x = 0;
        if (length<=1){
            return true;
        }
        if (s.charAt(0)=='A'){
            x++;
        }
        for (int i = 1; i < length; i++) {
            if (s.charAt(i)=='A'){
                x++;
                if (x==2){
                    return false;
                }
            }
            if (i<=length-2&&s.charAt(i-1)==s.charAt(i)&&s.charAt(i)==s.charAt(i+1)&&s.charAt(i)=='L'){
                return false;
            }
        }
        return true;
    }
}