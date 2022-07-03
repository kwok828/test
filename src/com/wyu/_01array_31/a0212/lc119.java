package com.wyu._01array_31.a0212;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
在「杨辉三角」中，每个数是它左上方和右上方的数的和。
*
* 示例 1:
输入: rowIndex = 3
输出: [1,3,3,1]
示例 2:
输入: rowIndex = 0
输出: [1]
示例 3:
输入: rowIndex = 1
输出: [1,1]
* */
public class lc119 {
    public static void main(String[] args) {
        Solution119 s = new Solution119();
        List<Integer> row = s.getRow(3);
        for (Integer integer : row) {
            System.out.print(integer+" ");
        }
    }
}
/*
*   思路：可以先构造杨辉三角出来，构建关键在于List<List<Integer>>
        除了首尾为1，之后每个数等于上一行该位置数值与前一位置数值之和
        每构建一行后应加入这个List<List<Integer>>。
        * 期间进行行数判断即可，如果构建为所求行数即返回
* */
class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    list.add(1);
                }else {
                    list.add(listList.get(i-1).get(j-1)+listList.get(i-1).get(j));
                }
                if (j==rowIndex){
                    return list;
                }
            }
            listList.add(list);
        }
        return null;
    }
}