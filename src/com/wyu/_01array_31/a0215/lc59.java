package com.wyu._01array_31.a0215;
/*
* 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，
* 且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
*
* 输入：n = 3
输出：[[1,2,3],[8,9,4],[7,6,5]]
*
* 输入：n = 1
输出：[[1]]
* */
public class lc59 {
    public static void main(String[] args) {
        Solution59 s = new Solution59();
        int[][] nums = s.generateMatrix(5);
        for (int[] num : nums) {
            for (int i : num) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
class Solution59 {
    public int[][] generateMatrix(int n) {
        int[][] nums  = new int[n][n];
        if (n==1){
            nums[0][0] = 1;
            return nums;
        }
        int rows = nums.length;
        int cols = nums[0].length;
        int left = 0,right = cols-1,top = 0,bottom = rows-1;
        int num = 1;
        while(left<=right && top<=bottom){
            for (int col = left; col <= right; col++) {
                nums[top][col] = num++;
            }
            for (int row = top+1; row <= bottom; row++) {
                nums[row][right] = num++;
            }
            if(left<right && top<bottom){
                for (int col = right-1; col > left; col--) {
                    nums[bottom][col] = num++;
                }
                for (int row = bottom; row > top; row--) {
                    nums[row][left] = num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return nums;
    }
}
