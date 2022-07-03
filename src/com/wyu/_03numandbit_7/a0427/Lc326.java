package com.wyu._03numandbit_7.a0427;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/4/27 18:30
 */
/*
*   给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
*
* 示例 1：
输入：n = 27
输出：true
*
*  00000001   1    254 11111110
*  00000011   3    252 11111100
*  00001001   9    246 11110110
*  00011011   27   228 11100100
*  01010001   81   174 10101110
*  11110011   243  12  00001100
*
* 例 2：
输入：n = 0
输出：false
* */
public class Lc326 {
    public static void main(String[] args) {
        Solution326 s = new Solution326();
    }
}
class Solution326 {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}