package com.dxs.leetcode.bitManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月13日 上午9:48:17
 *  Given an integer, return its base 7 string representation.
	Example 1:
	
	Input: 100
	Output: "202"
	Example 2:
	Input: -7
	Output: "-10"
	Note: The input will be in range of [-1e7, 1e7].
  	解析：给出一个十进制数，返回它的7进制。
           十进制转N进制的方法就是，十进制数除N取余，然后反向加起来余数。负数加负。
 */
public class Base7 {
	public String convertToBase7(int num) {
        
		if(num == 0) return "0";
		
		String res = "";
		//判断正负
		boolean pos = num > 0;
		
		while(num != 0){
			res = String.valueOf(Math.abs(num%7)) + res;
			num /= 7;
		}
		if(pos == false){
			res = "-"+res;
		}
		
		return res;
    }
	public static void main(String[] args) {
		

	}

}
