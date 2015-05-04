package com.dxs.leetcode;

public class RomantoInteger {
	public static int romanToInt(String s) {
        int len = s.length();
        if(len <= 0) return 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
        	int pre = getInteger(s.charAt(i));
        	if(i == len-1){
        		sum += pre;
        	}else{
        		int cur = getInteger(s.charAt(i+1));
        		if(pre < cur){
        			sum -= pre;
        		}else{
        			sum += pre;
        		}
        	}
		}
        return sum;
    }
	public static int getInteger(char ch){
		int i = 0;
		switch (ch) {
		case 'I':
			i = 1;
			break;
		case 'V':
			i = 5;
			break;
		case 'X':
			i = 10;
			break;
		case 'L':
			i = 50;
			break;
		case 'C':
			i = 100;
			break;
		case 'D':
			i = 500;
			break;
		case 'M':
			i = 1000;
			break;
		default:
			break;
		}
		return i;
	}
	public static void main(String[] args) {
		String s = "DCXXI";
		String s1 = "MCMXCVI";
		System.out.println(romanToInt(s));
		System.out.println(romanToInt(s1));
	}
}
