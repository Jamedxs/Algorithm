package com.dxs.leetcode.Math;

/**
 * Created by dengxusheng on 2017-08-18.
 *You have a total of n coins that you want to form in a staircase shape, where every k-th row must have exactly k coins.
     Given n, find the total number of full staircase rows that can be formed.
     n is a non-negative integer and fits within the range of a 32-bit signed integer.
     Example 1:
     n = 5

     The coins can form the following rows:
     ¤
     ¤ ¤
     ¤ ¤

     Because the 3rd row is incomplete, we return 2.

     Example 2:
     n = 8
     The coins can form the following rows:
     ¤
     ¤ ¤
     ¤ ¤ ¤
     ¤ ¤
     Because the 4th row is incomplete, we return 3.
 */
public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        int i;
        for (i=1; n>0; ++i){
            n -= i;
        }
        if(n < 0)
            return i - 2;
        else
            return i - 1;
    }

    public static int arrangeCoins2(int n) {
        if(n <= 1) return n;
        int left = 0;
        int right = n;
        while(left <= right){
            int mid = left + (right - left)/2 ;
            int sum = ((1 + mid) * mid)/2;
            if(sum <= n){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return left - 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}
