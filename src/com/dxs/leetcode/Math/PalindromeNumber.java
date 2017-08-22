package com.dxs.leetcode.Math;

/**
 * Created by dengxusheng on 2017-08-22.
 * Determine whether an integer is a palindrome. Do this without extra space.
 click to show spoilers.

 解析：判断integer是否是回文数，不可以使用额外的空间，这样就不能转换成string来进行判断了。只能对integer进行除法运算，从高位和低位分别判断是否相等。注意除和取余。
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        int hight = 1;//高位
        while(hight <= x / 10){
            hight *= 10;
        }

        while(x > 0){
            if( (x/hight) != (x % 10) )
                return false;
            x = (x%hight)/10;
            hight /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}
