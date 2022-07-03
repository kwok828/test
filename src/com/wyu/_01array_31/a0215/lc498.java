package com.wyu._01array_31.a0215;

import java.util.ArrayList;
import java.util.Collections;

/*
* 给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。
* 输入：mat = [[1,2,3],[4,5,6],[7,8,9]]
    输出：[1,2,4,7,5,3,6,8,9]
    * 1 2 3             1   2   3   4           1 2
    * 4 5 6             5   6   7   8           3 4
    * 7 8 9             9   10  11  12
*
* 输入：mat = [[1,2],[3,4]]
    输出：[1,2,3,4]
    *
* */
public class lc498 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        Solution498 s = new Solution498();
        int[] nums = s.findDiagonalOrder(mat);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
/*
*   左上到右上，右上到右下总和表示需要遍历的斜线数 即N+M
*   如果没超过列数，那么都在第一行，超过了则取d-M+1得对应行
*   如果没超过列数，那么列为对应列，超过了则取最后一列
*   没超即遍历第一行每一列，超即遍历最后一列每一行，之后下标为++行，--列
*   判断如果为偶数行反转
* */
class Solution498 {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length==0){
            return new int[0];
        }
        int N = mat.length;
        int M = mat[0].length;
        int[] result = new int[N*M];
        int k = 0;
        ArrayList<Integer> intermediate = new ArrayList<Integer>();
        for (int d = 0; d < N+M-1; d++) {
            intermediate.clear();
            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M-1;
            while(r<N && c>-1){
                intermediate.add(mat[r][c]);
                ++r;
                --c;
            }
            if (d%2==0){
                Collections.reverse(intermediate);
            }
            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}