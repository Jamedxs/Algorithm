package com.dxs.leetcode.String;

/**
 * Created by dengxusheng on 2017-09-29.
 * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
 Example 1:
 Input: "aba"
 Output: True

 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.

 Note:
 1. The string will only contain lowercase characters a-z. The maximum length of the string is 50000

 解析：之前做过一套回文数题目【AC】Valid Palindrome，里面的解法可以在这里用得上，由于题目的特殊要求，可以最多删除一个字符，这个时候还是两个指针从收尾向中间扫描，当遇到第一个不同的字符的时候，利用【AC】Valid Palindrome中的方法来判断，i+1 与j   或者 i与j-1 是否相等。
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i) != s.charAt(len - i -1)){
                int j = len - i - 1;
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s,int i ,int j){
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int k = i; k <= i + (j - i)/2; k++) {
            if(s.charAt(k) != s.charAt(j - k + i))
                return false;
        }
        return true;
    }
}
