package com.wyu._02string_27.a0218;

/*
* 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
说明：本题中，我们将空字符串定义为有效的回文串。
*
* 输入: "A man, a plan, a canal: Panama"
输出: true
解释："amanaplanacanalpanama" 是回文串
*
* 输入: "race a car"
输出: false
解释："raceacar" 不是回文串
* */
public class lc125 {
    public static void main(String[] args) {
//        String string = "A man, a plan, a canal: Panama";
        String string = "0P";
        Solution125 s = new Solution125();
        System.out.println(s.isPalindrome(string));
    }
}
class Solution125 {
    public boolean isPalindrome(String s) {
//        String s1 = s.toLowerCase();
//        ArrayList<Character> list = new ArrayList<>();
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
//                list.add(s1.charAt(i));
//            }
//            if (s1.charAt(i)>='A'&&s1.charAt(i)<='Z'){
//                list.add(s1.charAt(i));
//            }
//            if (s1.charAt(i)=='0'||s1.charAt(i)>='1'&&s1.charAt(i)<='9'){
//                list.add(s1.charAt(i));
//            }
//        }
//        int len = list.size();
//        for (int i = 0; i < len/2; i++) {
//            if (list.get(i)==list.get(len-1-i)){
//                continue;
//            }else {
//                return false;
//            }
//        }
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        StringBuffer sbreverse = new StringBuffer(sb).reverse();
        return sb.toString().equals(sbreverse.toString());
    }
}
