package com.wyu._03numandbit_7.a0425;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/4/25 11:20
 */
/*
* 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
*
* 示例 1：
输入：n = 1
输出：true
解释：2^0 = 1
*
示例 2：
输入：n = 16
输出：true
解释：2^4 = 16
*
* */
public class Lc231 {
}
class Solution231 {
    public boolean isPowerOfTwo(int n) {
        return n > 0 &&  (n & (n-1)) == 0;
    }
}
