package com.wyu._01array_31.a0214;

import java.util.ArrayList;
import java.util.List;
/*
* 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素
* 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
  输出：[1,2,3,6,9,8,7,4,5]
* 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
  输出：[1,2,3,4,8,12,11,10,9,5,6,7]
* */
public class lc54 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3,4},{5,6,7,8},{9,10,11,12}};
        Solution54 s = new Solution54();
        List<Integer> list = s.spiralOrder(matrix);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
    }
}
class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return list;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0,right = columns-1,top = 0,bottom = rows-1;
        while (left<=right && top<=bottom){
//              当左小于右时，每行最左加到右
            for (int column = left; column <= right; column++) {
                list.add(matrix[top][column]);
            }
//            当上小于下时，每行上加到下
            for(int row = top+1;row <= bottom; row++){
                list.add(matrix[row][right]);
            }
//            左上到右上及右上到右下加完判断如果左及上仍小于默认行列，
//            那么开始加入右上到左下，左下到左上
            if (left<right && top<bottom){
//              右上到左下
                for (int column = right-1; column > left ; column--) {
                    list.add(matrix[bottom][column]);
                }
//                左下到左上
                for (int row = bottom; row > top; row--) {
                    list.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        return list;
    }
}