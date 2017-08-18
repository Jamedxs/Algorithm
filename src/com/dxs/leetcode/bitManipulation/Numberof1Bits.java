package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月31日 上午9:29:58
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
   For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
         解析：求一个32位十进制数变成二进制后其中1的个数，也就是汉明重量。
 */
public class Numberof1Bits {
	public static int hammingWeight(int n) {
		int res = 0;
		String str = Integer.toBinaryString(n);
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') res++;
		}
		return res;
    }
	public static void main(String[] args) {
		int n = 11;
		System.out.println(hammingWeight(n));
	}

}
