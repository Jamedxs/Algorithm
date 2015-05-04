package com.dxs.leetcode;

public class ImplementstrStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		System.out.println(strStr(s1,s2));
	}

	public static int strStr(String haystack, String needle) {
		int haystacklen = haystack.length();
		int needlelen = needle.length();
		if(haystacklen < 0 || haystacklen < needlelen || needlelen < 0) return -1;
		if((haystacklen == needlelen && needlelen == 0) || needlelen == 0) return 0;
		for (int i = 0; i < haystacklen; i++) {
			if(haystacklen - i + 1 < needlelen) return -1;
			int k = i;
			int j = 0;
			while (j < needlelen && k < haystacklen && haystack.charAt(k) == needle.charAt(j)) {
				k++;
				j++;
				if(j == needlelen) return i;
			}
		}
		return -1;
	}

}
