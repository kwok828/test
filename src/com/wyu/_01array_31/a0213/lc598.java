package com.wyu._01array_31.a0213;
/*
* 给你一个 m x n 的矩阵 M ，初始化时所有的 0 和一个操作数组 op ，
* 其中ops[i]=[ai, bi]意味着当所有的0<=x<ai和0<=y<bi时，M[x][y]应该加 1。
在 执行完所有操作后 ，计算并返回 矩阵中最大整数的个数 
*
* 输入: m = 3, n = 3，ops = [[2,2],[3,3]]
输出: 4
解释: M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
示例 2:
输入: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
输出: 4
示例 3:
输入: m = 3, n = 3, ops = []
输出: 9
* */
public class lc598 {
    public static void main(String[] args) {
        int[][] ops = {};
        Solution598 s = new Solution598();
        System.out.println(s.maxCount(3, 3, ops));
    }
}
//只需要计算行与修改行最小值乘和列与修改列最小值的乘积即可
class Solution598 {
    public int maxCount(int m, int n, int[][] ops) {
        int mina = m;
        int minb = n;
        for (int[] op : ops) {
            mina = Math.min(mina,op[0]);
            minb = Math.min(minb,op[1]);
        }
        return mina*minb;
    }
}