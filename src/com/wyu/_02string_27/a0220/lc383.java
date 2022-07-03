package com.wyu._02string_27.a0220;

/*
* 给你两个字符串：ransomNote 和 magazine ，
* 判断 ransomNote 能不能由 magazine 里面的字符构成。
如果可以，返回 true ；否则返回 false 。
magazine 中的每个字符只能在 ransomNote 中使用一次。

示例 1：
输入：ransomNote = "a", magazine = "b"
输出：false
示例 2：
输入：ransomNote = "aa", magazine = "ab"
输出：false
示例 3：
输入：ransomNote = "aa", magazine = "aab"
输出：true
* */
public class lc383 {
    public static void main(String[] args) {
//        String ransomNote = "a";
//        String magazine = "b";
        String ransomNote = "aad";
        String magazine = "adba";
        Solution383 s = new Solution383();
        boolean flag = s.canConstruct(ransomNote, magazine);
        System.out.println(flag);
    }
}
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
//        int rlen = ransomNote.length();
//        int mlen = magazine.length();
//        if (rlen>mlen){
//            return false;
//        }
//        char[] rchars = ransomNote.toCharArray();
//        char[] mchars = magazine.toCharArray();
//        Arrays.sort(rchars);
//        Arrays.sort(mchars);
//        int j = 0;
//        for (int i = 0; i < mlen; i++) {
//            if (rchars[j]==mchars[i]){
//                j++;
//                if (j==rlen){
//                    return true;
//                }
//                continue;
//            }
//        }
//        return false;

// 计数法，创建26位数组代表26个字母，扫描magazine，字符减去a得出对应位置字母，出现一次自增1
// 扫描ransomNote，字符减去a得出对应位置字母，出现一次自减1，
// 如果小于0那么说明magazine自增结果后不够提供给ransomNote使用
        if (ransomNote.length()>magazine.length()){
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c-'a']--;
            if (cnt[c-'a']<0){
                return false;
            }
        }
        return true;
    }
}