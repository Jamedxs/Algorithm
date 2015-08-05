package com.dxs.leetcode.String;

import java.util.Stack;

public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "A man a plan a canal Panama";
		String s1 = "Aa";
		String s2 = "a.";
		ValidPalindrome val = new ValidPalindrome();
		System.out.println(val.isPalindrome1(s));
		System.out.println(val.isPalindrome1(s1));
		System.out.println(val.isPalindrome1(s2));
	}
	
	public boolean isPalindrome(String s){
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = s.length();
		if(len == 0 || len == 1) return true;
		for (int i = 0; i < len/2; i++) {
			if(s.charAt(i) != s.charAt(len-1-i))
				return false;
		}
		return true;
	}
	
	public boolean isPalindrome1(String s){
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int len = s.length();
		if(len == 0 || len == 1) return true;
		Stack<Character> stack = new Stack<Character>();
		int k = 0;
		while(k < len/2)
		{
			stack.push(s.charAt(k));
			k++;
		}
		
		if(len%2 == 1) k++;
		
		while(k < len){
			if(stack.empty()) 
				return false;
			char ch = stack.pop();
			if(ch != s.charAt(k)) 
				return false;
			else 
				k++;
		}
		
		return true;
	}
}
