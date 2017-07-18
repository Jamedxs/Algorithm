package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月18日 上午10:12:49
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
	Note:
	1. The length of both num1 and num2 is < 5100.
	2. Both num1 and num2 contains only digits 0-9.
	3. Both num1 and num2 does not contain any leading zero.
	4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
	解析：两个String相加，不允许为将输入数组转化为integer，String默认为0-9的数字并且数字不已0开始。联想到以前做的String的题目，26个字母，new出来一个int[26]的数组，然后用str.charAt(i)-'a'，来取到数字进行判断是否存在。这时候可以对num1.chatAt(i)-'0'来得到每一位的数值，进行相加。注意将取余的数加到返回的string中。
 */
public class AddStrings {
	public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        String res = "";
        
        while(i >= 0 || j >= 0){
        	if(i >=0){
        		carry += num1.charAt(i--) - '0';
        	}
        	if(j >=0){
        		carry += num2.charAt(j--) - '0';
        	}
        	
        	res = Integer.toString(carry%10) + res;
        	carry /= 10;
        }
        
		return carry != 0 ? "1"+res:res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
