package com.wyu._01array_31.a0216;

/*
* 给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。

* 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[[7,4,1],[8,5,2],[9,6,3]]
*
* 输入：matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
输出：[[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
* */
public class lc48 {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        Solution48 s = new Solution48();
        s.rotate(matrix);
    }
}
class Solution48 {
    public void rotate(int[][] matrix) {
        int rows = matrix.length-1;
        int temp = 0;
        int swap = 0;
//        使用两个临时变量存储两个对角
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows-i; j++) {
                //        存储右上到右下
                temp = matrix[j][rows-i];
                //        赋值左上到右上的值给右上到右下
                matrix[j][rows-i] = matrix[i][j];
                //        存储右下到左下
                swap = matrix[rows-i][rows-j];
                //        赋值右上到右下给右下到左下
                matrix[rows-i][rows-j] = temp;
                //        存储到左下到左上
                temp = matrix[rows-j][i];
                //        赋值右下到左下给左下到左上
                matrix[rows-j][i] = swap;
                //        赋值左下到左上给左上到右上
                matrix[i][j] = temp;
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