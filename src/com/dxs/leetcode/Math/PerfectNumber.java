package com.dxs.leetcode.Math;

/**
 * Created by dengxusheng on 2017-08-31.
 * We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
     Now, given an integer n, write a function that returns true when it is a perfect number and false when it is not.
     Example:

     Input: 28
     Output: True
     Explanation: 28 = 1 + 2 + 4 + 7 + 14
     解析：
 */
public class PerfectNumber {
    public static boolean checkPerfectNumber(int num) {
        if(num <= 0){
            return false;
        }
        int sum = 0;
        int sqrt = (int)Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if(num % i == 0){
                sum += i;
                if(i * i != num){
                    sum += num / i;
                }
            }
        }

        return sum - num == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
}
