package com.dxs.leetcode.bitManipulation;

public class HammingDistance {
	
	public static int hammingDistance(int x, int y) {
		
		if(x == y) return 0;
		
		String value = String.valueOf(Integer.toBinaryString(x^y));
		int res = 0;
		for (int i = 0; i < value.length(); i++) {
			if(value.charAt(i) == '1') res++;			
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		System.out.println(hammingDistance(x,y));
	}
}
