package com.wyu._03numandbit_7.a0530;

/**
 * Description:
 *
 * @author Kwok
 * @date 2022/5/30 22:28
 */
/*丑数 就是只包含质因数 2、3 和 5 的正整数。
给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
示例 1：
输入：n = 6
输出：true
解释：6 = 2 × 3
示例 2：
输入：n = 1
输出：true
解释：1 没有质因数，因此它的全部质因数是 {2, 3, 5} 的空集。习惯上将其视作第一个丑数。
 */
public class Lc263 {
    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(11));
    }
}
class Solution263 {
    public boolean isUgly(int n) {
        if (n == 1){
            return true;
        }
        if (n == 0){
            return false;
        }
        int[] num = {2,3,5};
        for (int i : num) {
            while(n % i == 0){
                n = n/i;
            }
        }
        if (n == 1){
            return true;
        }else return false;
    }
}