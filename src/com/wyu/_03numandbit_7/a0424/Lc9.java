package com.wyu._03numandbit_7.a0424;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/4/24 10:14
 */
/*
* 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
*
* 例如，121 是回文，而 123 不是。
*
* 输入：x = 121
输出：true
*
示例 2：
输入：x = -121
输出：false
解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
*
示例 3：
输入：x = 10
输出：false
解释：从右向左读, 为 01 。因此它不是一个回文数。
* */
public class Lc9 {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        System.out.println(s.isPalindrome(10));
    }
}
class Solution9 {
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        int rev = 0;
        while(rev < x){
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除
        return x == rev || x == rev / 10;


        // if (x < 0){
        //     return false;
        // }else if (x < 10){
        //     return true;
        // }
        // String num = String.valueOf(x);
        // int i = 0, j = num.length()-1;
        // boolean flag = false;
        // while(i<j){
        //     if (num.charAt(i)==num.charAt(j)){
        //         flag = true;
        //     }else{
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return flag;




    }
}