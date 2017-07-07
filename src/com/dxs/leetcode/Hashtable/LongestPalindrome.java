package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月7日 上午9:51:58
 * 
 */
public class LongestPalindrome {
	public static int longestPalindrome(String s) {
		if(s==null || s.length()==0) return 0;
		Set<Character> set = new HashSet<Character>();
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if(set.contains(s.charAt(i))){
				set.remove(s.charAt(i));
				res++;
			}else{
				set.add(s.charAt(i));
			}
		}
		if(!set.isEmpty()) return res*2+1;
		
		return res*2;
    }
	public static void main(String[] args) {
		String s = "aaaa";
		System.out.println(longestPalindrome(s));
	}

}
