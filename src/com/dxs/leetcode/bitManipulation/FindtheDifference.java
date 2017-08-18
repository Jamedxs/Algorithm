package com.dxs.leetcode.bitManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月21日 上午10:46:36
 * 
 */
public class FindtheDifference {
	public static char findTheDifference(String s, String t) {
		char ch = 0;
        
        for (int i = 0; i < s.length(); i++) {
			ch ^= s.charAt(i);
		}
        for (int i = 0; i < t.length(); i++) {
			ch ^= t.charAt(i);
		}
        return ch;
    }
	public static void main(String[] args) {
		String s = "a";
		String t = "aa";
		System.out.println(findTheDifference(s,t));
	}

}
