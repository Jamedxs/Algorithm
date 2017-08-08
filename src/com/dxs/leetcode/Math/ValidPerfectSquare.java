package com.dxs.leetcode.Math;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月8日 上午9:29:03
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
	Note: Do not use any built-in library function such as sqrt.
	Example 1:
	Input: 16
	Returns: True
	
	
	Example 2:
	Input: 14
	Returns: False
	
	解析：判断一个数是否是完全平方。
 */
public class ValidPerfectSquare {
	public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while(left <= right){
        	int mid = left + (right - left) / 2 ;
        	int sum = mid * mid;
        	if(sum == num){
        		return true;
        	}else if(sum < num){
        		left = mid + 1;
        	}else{
        		right = mid - 1;
        	}
        }
        
        return false;
    }
	
	public boolean isPerfectSquare2(int num) {
        for (int i = 1; i <= num / i; ++i) {
            if (i * i == num) return true;
        }
        return false;
    }
	public static void main(String[] args) {
		int num = 16;
		System.out.println(isPerfectSquare(num));
	}

}
