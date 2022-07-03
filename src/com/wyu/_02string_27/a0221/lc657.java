package com.wyu._02string_27.a0221;

/*
* 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，
* 判断这个机器人在完成移动后是否在 (0, 0) 处结束。
    移动顺序由字符串 moves 表示。字符 move[i] 表示其第 i 次移动。
* 机器人的有效动作有 R（右），L（左），U（上）和 D（下）。
    如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
    注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，
* “L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。

示例 1:
输入: moves = "UD"
输出: true
解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，
* 因此它最终回到它开始的原点。因此，我们返回 true。
示例 2:
输入: moves = "LL"
输出: false
解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。
* 我们返回 false，因为它在移动结束时没有返回原点。
* */
public class lc657 {
    public static void main(String[] args) {
        String moves = "RL";
        Solution657 s = new Solution657();
        boolean flag = s.judgeCircle(moves);
        System.out.println(flag);
    }
}
//  因为移动只有上下左右四个字母，可以分别计算每个字符次数，然后上下、左右互相抵消，都为零即原点
//  否则不在原点，也可以利用x、y进行统计，自身进行++；--即可
class Solution657 {
    public boolean judgeCircle(String moves) {
        int len = moves.length();
        int[] cnt = new int[4];
        for (int i = 0; i < len; i++) {
            if (moves.charAt(i)=='U'){
                cnt[0]++;
            }else if (moves.charAt(i)=='D'){
                cnt[1]++;
            }else if (moves.charAt(i)=='L'){
                cnt[2]++;
            }else {
                cnt[3]++;
            }
        }
        if (cnt[0]==cnt[1]&&cnt[2]==cnt[3]){
            return true;
        }
        return false;
    }
}