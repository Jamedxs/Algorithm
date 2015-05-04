package com.dxs.leetcode;

import java.util.Stack;

public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "(){}[]";
		String s2 = "]";
		String s3 = "({[]})";
		System.out.println(isValid(s1));
		System.out.println(isValid(s2));
		System.out.println(isValid(s3));
	}
	
	private static boolean isValid(String s) {
		int length = s.length();
		if(length <= 0) return false;
		Stack<Character> stack =  new Stack<Character>();
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if(ch == '(' || ch == '{' || ch == '[')
			{
				//×óÀ¨ºÅ Ñ¹Õ»
				stack.push(ch);
			}else if(stack.empty() == false)
			{
				char c = stack.peek();
				switch (c) {
				case '(':
					if(ch == ')') stack.pop();
					else return false;
					break;
				case '{':
					if(ch == '}') stack.pop();
					else return false;
					break;
				case '[':
					if(ch == ']') stack.pop();
					else return false;
					break;
				}
			}else
			{
				return false;
			}
		}
		if(stack.empty() == true) return true;
		else return false;
	}

}
