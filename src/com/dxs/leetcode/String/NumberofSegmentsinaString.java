package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月17日 上午9:40:45
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
	Please note that the string does not contain any non-printable characters.
	Example:
	Input: "Hello, my name is John"
	Output: 5
	
	
	解析：判断是否是连续的string  如果是字符串之间有非空格的话就算一个字符串，有空格的话就算两个字符串了。判断字符串，注意第一个字符串。

 */
public class NumberofSegmentsinaString {
	public int countSegments(String s) {
        int count = 0;
        if(s == null || "".equals(s) || s.length() <= 0 ) return count;
        for (int i = 0; i < s.length(); i++) {
			if(i == 0 && s.charAt(i) != ' ') count++;
			if(i > 0 && s.charAt(i-1) == ' ' && s.charAt(i) != ' ') count++;
		}
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
