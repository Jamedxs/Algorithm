package com.dxs.leetcode.String;

public class DetectCapital {
	
	public static boolean detectCapitalUse(String word) {
        String lowStr = word.toLowerCase();
        String upperStr = word.toUpperCase();
        if(word.equals(lowStr) || word.equals(upperStr))
        	return true;
        //判断首字母
        char ch = word.charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
        	String str = word.substring(1);
        	if(str.equals(lowStr.substring(1)))
        		return true;
        }
        return false;
    }
	public static void main(String[] args) {
		String s = "GoPgle";
		System.out.println(detectCapitalUse(s));
	}

}
