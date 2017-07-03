package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月3日 上午9:10:23
 * 
 */
public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
			res = res * 26 + (s.charAt(i) - 'A' + 1);
		}
        
        return res;
    }
	public static void main(String[] args) {
		String s = "AAA";
		System.out.println(titleToNumber(s));
	}

}
