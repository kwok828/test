package com.wyu._03numandbit_7.a0425;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/4/25 14:46
 */
/*
* 给定一个整数，写一个函数来判断它是否是 4 的幂次方。如果是，返回 true ；否则，返回 false 。
整数 n 是 4 的幂次方需满足：存在整数 x 使得 n == 4^x
* 示例 1：
输入：n = 16
输出：true
*
示例 2：
输入：n = 5
输出：false
* */


public class Lc342 {
    public static void main(String[] args) {
        Solution342 s = new Solution342();
        s.isPowerOfFour(16);
    }
}
class Solution342 {
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) ==0 && (n & 0xaaaaaaaa) == 0;
    }
}