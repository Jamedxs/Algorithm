package com.dxs.leetcode.String;

import java.util.HashMap;

/*
Given a string, find the length of the longest substring without repeating characters.
Examples:
Given "abcabcbb", the answer is "abc", which the length is 3.
Given "bbbbb", the answer is "b", with the length of 1.
Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0,j = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				j = Math.max(j, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max = Math.max(max, i-j+1);
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
