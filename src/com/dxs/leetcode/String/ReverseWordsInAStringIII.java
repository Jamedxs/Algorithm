package com.dxs.leetcode.String;

public class ReverseWordsInAStringIII {
	//利用StringBuilder的字符反转  14ms
	public static String reverseWords(String s) {
		String[] strs = s.split("\\ ");
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			StringBuilder sbReverse = new StringBuilder(str);
			sb.append(sbReverse.reverse()).append(" ");
		}
		String res = sb.substring(0, sb.length()-1);
		return res;
    }
	//19ms
	public static String reverseWords2(String s) {
        String res = "";
		String[] strs = s.split("\\ ");
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			int len = str.length();
			char[] chArray = str.toCharArray();  
	        for(int i= 0; i< len/2; i++) {  
	            char temp;  
	            temp = chArray[i];  
	            chArray[i] = chArray[len- 1- i];  
	            chArray[len- 1- i] = temp;  
	        }  
			sb.append(String.valueOf(chArray)).append(" ");
		}
		res = sb.substring(0, sb.length()-1);
		return res;
    }

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords2(s));
	}

}
