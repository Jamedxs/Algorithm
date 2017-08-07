package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月7日 上午10:29:04
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
	Example 1:
	
	Input: "abab"
	
	Output: True
	
	Explanation: It's the substring "ab" twice.
	
	
	Example 2:
	
	Input: "aba"
	
	Output: False
	
	
	Example 3:
	
	Input: "abcabcabcabc"
	
	Output: True
	
	Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
	
	解析：判断一个String是否由其子串组成，直接想到的是暴力接取，遍历String一半的长度，从一半到0开始遍历接取字符串，拼接，看是否与原字符等同，如果相同则返回true，否则返回false。
 */
public class RepeatedSubstringPattern {
	//暴力截取
	public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for (int i = length/2; i >= 1; i--) {
			if(length % i == 0){
				//k为子串出现的次数
				int k = length / i;
				String subStr = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < k; j++) {
					sb.append(subStr);
				}
				if(sb.toString().equals(s)) return true;
			}
		}
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
