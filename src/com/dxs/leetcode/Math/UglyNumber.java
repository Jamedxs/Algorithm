package com.dxs.leetcode.Math;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月1日 上午8:56:48
 * 
 */
public class UglyNumber {
	public boolean isUgly(int num) {
		if(num <= 0) return false;
		 while (num % 2 == 0) num /= 2;
	     while (num % 3 == 0) num /= 3;
	     while (num % 5 == 0) num /= 5;
	     return num == 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
