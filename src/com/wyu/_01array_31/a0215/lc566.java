package com.wyu._01array_31.a0215;

import java.util.ArrayList;

/*
    在 MATLAB 中，有一个非常有用的函数 reshape ，
    它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
    给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，
    分别表示想要的重构的矩阵的行数和列数。
    重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
    如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
*
    输入：mat = [[1,2],[3,4]], r = 1, c = 4
    输出：[[1,2,3,4]]
    输入：mat = [[1,2],[3,4]], r = 2, c = 4
    输出：[[1,2],[3,4]]
*  */
public class lc566 {
    public static void main(String[] args) {
        int[][] mat = {{1,2}};
        Solution566 s = new Solution566();
        int[][] matrixReshape = s.matrixReshape(mat,1,1);
        for (int[] ints : matrixReshape) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}

class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r*c!=mat.length*mat[0].length){
            return mat;
        }
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int[] ints : mat) {
            for (int anInt : ints) {
                arrayList.add(anInt);
            }
        }
        int[][] nums = new int[r][c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                nums[i][j] = arrayList.get(k++);
            }
        }
        return nums;
    }
}