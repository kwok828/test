package com.wyu._01array_31.a0213;

/*
* 给你一个大小为 m x n 的矩阵 board 表示甲板，其中，
* 每个单元格可以是一艘战舰 'X' 或者是一个空位 '.' ，返回在甲板 board 上放置的 战舰 的数量。
战舰 只能水平或者垂直放置在 board 上。换句话说，
* 战舰只能按 1 x k（1 行，k 列）或 k x 1（k 行，1 列）的形状建造，其中 k 可以是任意大小。
* 两艘战舰之间至少有一个水平或垂直的空位分隔 （即没有相邻的战舰）。
输入：board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
输出：2
示例 2：
输入：board = [["."]]
输出：0
* */
public class lc419 {
    public static void main(String[] args) {
        char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        Solution419 s = new Solution419();
        int i = s.countBattleships(board);
        System.out.println(i);
    }
}
/*
*   思路：如果有几个’X‘相邻都只能算1个，那么我们只需要先判断遇到的是否为第一个’X‘，是加1即可，
*        之后在进行相邻’X‘判断
*        如果第一个’X‘之后相邻有’X‘那么跳出当前循环继续判断下一位
* */
class Solution419 {
    public int countBattleships(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int ant = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j]=='X'){
                    if (i>0 && board[i-1][j]=='X'){
                        continue;
                    }
                    if ((j>0 && board[i][j-1]=='X')){
                        continue;
                    }
                    ant++;
                }
            }
        }
        return ant;
    }
}