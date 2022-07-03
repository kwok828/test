package com.wyu._01array_31.a0216;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
* 输入：matrix = [[1,1,1],[1,0,1],[1,1,1]]
输出：[[1,0,1],[0,0,0],[1,0,1]]
*
* 输入：matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
输出：[[0,0,0,0],[0,4,5,0],[0,3,1,0]]
* */
public class lc73 {
    public static void main(String[] args) {
//        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        Solution73 s = new Solution73();
        s.setZeroes(matrix);
    }
}
class Solution73 {
    public void setZeroes(int[][] matrix) {
        List<int[][]> listList = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j]==0){
                    int[][] nums = {{i,j}};
                    listList.add(nums);
                }
            }
        }
        for (int[][] ints : listList) {
            int row = ints[0][0];
            int col = ints[0][1];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == row || j == col){
                        matrix[i][j]=0;
                    }

                }
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
