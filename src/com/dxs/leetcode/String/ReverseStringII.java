package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月14日 上午10:32:48
 * 
 */
public class ReverseStringII {
	public static String reverseStr(String s, int k) {
        
		StringBuilder res = new StringBuilder();
		int length = s.length();
		if(k >= length) return reverse(s);
		int count = 0;
		for (int i = 0; i < length ; i += 2 * k) {
			if(count != 0){
				res.append(s.substring(i-k, i));
			}
			res.append(reverse(s.substring(i, Math.min(i+k, length))));
			count++;
		}
		
		if(res.length() < length){
			res.append(s.substring(res.length()));
		}
		
		return res.toString();
    }
	
	public static String reverse(String str){
		char[] ch = str.toCharArray();
		char temp;
		int halfLenght = str.length() / 2 ;
		int length = str.length();
		
		for (int i = 0; i < halfLenght; i++) {
			temp = ch[length-1-i];
			ch[length-1-i] = ch[i];
			ch[i] = temp;
		}
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		String s = "abcdefg";
		System.out.println(reverseStr(s, 2));
	}

}
