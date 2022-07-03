package com.wyu._01array_31.a0212;

import java.util.ArrayList;
import java.util.List;

/*
* 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
在「杨辉三角」中，每个数是它左上方和右上方的数的和。

* 输入: numRows = 5
输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
示例 2:
输入: numRows = 1
输出: [[1]]
* */
public class lc118 {
    public static void main(String[] args) {
        Solution118 s = new Solution118();
        List<List<Integer>> generate = s.generate(3);
        for (List<Integer> list : generate) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println();
        }
    }
}
/*
*   思路：第n行都有n个数，并且首尾都为1
*       出去首尾第i个数都为上一行第i个数与第i-1个数数值之和
* */
class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listList = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    list.add(1);
                }else {
                    list.add(listList.get(i-1).get(j-1)+listList.get(i-1).get(j));
                }
            }
            listList.add(list);
        }
        return listList;
    }
}