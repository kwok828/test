package com.wyu._03numandbit_7.a0427;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/4/27 19:06
 */

/*
* 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
*
* 示例 1:
输入: num = 100
输出: "202"

* 示例 2:
输入: num = -7
输出: "-10"
* */

public class Lc504 {
    public static void main(String[] args) {
        Solution504 s = new Solution504();
        System.out.println(s.convertToBase7(-70));
    }
}
class Solution504 {
    public String convertToBase7(int num) {
        if (num == 0){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int nums = Math.abs(num);
        int j = 0;
        while(nums>0){
            int i = nums % 7;
            sb.append(i);
            nums /= 7;
        }
        if (num<0){
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}