package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月6日 上午9:17:56
 * 
 */
public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		
		if((s == null||"".equals(s)||s.length() <= 0)&& (t == null||"".equals(t)||t.length() <= 0)) return true;
		
		if(s.length() != t.length()) return false;
		
        int[] alphabet = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 'a']++;
		}
        
        for (int i = 0; i < t.length(); i++) {
			if(--alphabet[t.charAt(i) - 'a'] < 0){
				return false;
			}
		}
        
        return true;
    }
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		System.out.println(isAnagram(s,t));
	}

}
