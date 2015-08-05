package com.dxs.leetcode.String;

public class LengthofLastWord {
	public static void main(String[] args) {
		String s1 = "addd dd";
		String s2 = "addd dddd ";
		String s3 = "addd dddd ddd";
		String s4 = "addd";
		String s5 = "     ";
		System.out.println(lengthOfLastWord(s1));
		System.out.println(lengthOfLastWord(s2));
		System.out.println(lengthOfLastWord(s3));
		System.out.println(lengthOfLastWord(s4));
		System.out.println(lengthOfLastWord(s5));
	}
	
	
	private static int lengthOfLastWord(String s) {
        int len = s.length();
        if(len <= 0) return 0;
        int sum = 0;
        while(s.charAt(len-1) == ' ')
        {
        	len--;
        	if(len == 0) break;
        }
        for (int i = len-1; i >= 0; i--) {
			if(s.charAt(i) !=  ' ') sum++;
			else break;
		}
		return sum;
    }
}
