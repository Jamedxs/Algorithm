package com.dxs.leetcode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月4日 上午9:40:50
 * 
 */
public class FirstUniqueCharacterinaString {
	
	public static int firstUniqChar(String s) {
        if(s == null || "".equals(s) || s.length() == 0) return -1;
        //26个字母
        int[] nums = new int[26];
        for (int i = 0; i < s.length(); i++) {
        	nums[s.charAt(i) - 'a']++;
		}
        //找出只出现一次
        for (int i = 0; i < s.length(); i++) {
			if(nums[s.charAt(i) - 'a'] == 1){
				return i;
			}
		}
		return -1;
    }
	
	public static void main(String[] args) {
		String s = "cc";
		System.out.println(firstUniqChar(s));
	}

}
