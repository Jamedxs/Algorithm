package com.dxs.leetcode.Math;

/**
 * Created by dengxusheng on 2017-08-21.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0){
            res += n / 5;
           n /= 5;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
