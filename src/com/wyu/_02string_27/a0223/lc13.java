package com.wyu._02string_27.a0223;
/*
* 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，
* 即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
* 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。
* 同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
给定一个罗马数字，将其转换成整数。
示例 1:
输入: s = "III"
输出: 3
示例 2:
输入: s = "IV"
输出: 4
示例 3:
输入: s = "IX"
输出: 9
* */
public class lc13 {
    public static void main(String[] args) {
        String s = "DCXXI";
//        String s = "IV";
//        String s = "III";
        Solution13 solution13 = new Solution13();
        int toInt = solution13.romanToInt(s);
        System.out.println(toInt);
    }
}
class Solution13 {
    public int romanToInt(String s) {
        int length = s.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i)=='I'){
                if (i+1<length&&s.charAt(i+1)=='V'){
                    sum += 4;
                    i += 1;
                    continue;
                }else if (i+1<length&&s.charAt(i+1)=='X'){
                    sum += 9;
                    i += 1;
                    continue;
                }
                sum += 1;
            }
            if (s.charAt(i)=='V'){
                sum += 5;
            }
            if (s.charAt(i)=='X'){
                if (i+1<length&&s.charAt(i+1)=='L'){
                    sum += 40;
                    i += 1;
                    continue;
                }else if (i+1<length&&s.charAt(i+1)=='C'){
                    sum += 90;
                    i += 1;
                    continue;
                }
                sum += 10;
            }
            if (s.charAt(i)=='L'){
                sum += 50;
            }
            if (s.charAt(i)=='C'){
                if (i+1<length&&s.charAt(i+1)=='D'){
                    sum += 400;
                    i += 1;
                    continue;
                }else if (i+1<length&&s.charAt(i+1)=='M'){
                    sum += 900;
                    i += 1;
                    continue;
                }
                sum += 100;
            }
            if (s.charAt(i)=='D'){
                sum += 500;
            }
            if (s.charAt(i)=='M'){
                sum += 1000;
            }
        }
        return sum;
    }
}