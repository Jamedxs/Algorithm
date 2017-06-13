package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月13日 上午10:01:59
 * 
 */
public class ReverseString {
	public static String reverseString(String s) {
		if(s == null || "".equals(s)) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1 ; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
    }
	public String reverseString2(String s) {
        char[] ch = s.toCharArray();
        int halfLength = s.length() / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
    }

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(reverseString(s));
	}

}
