package com.dxs.leetcode.String;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月19日 下午3:30:05
 * 
 */
public class LongestUncommonSubsequenceI {
	public int findLUSlength(String a, String b) {
        if(a.equals(b)){
        	return Math.max(a.length(), b.length());
        }else{
        	return -1;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
