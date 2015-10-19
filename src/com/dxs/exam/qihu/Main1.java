package com.dxs.exam.qihu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年8月11日
 */
public class Main1 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = 0;
        String str[] = new String[1024];
        int k = 0;
        t = cin.nextInt();
        for (int i = 0; i< t; i++) {
        	str[k++] = cin.next();
		}
        
        for (int i = 0; i < t; i++) {
        	System.out.println(FirstNotRepeatingChar(str[i]));
		}
	}
	
	public static char FirstNotRepeatingChar(String pStr){
		
		if(pStr == null) return '\0';
		
		int len = pStr.length();
		int hash[] = new int[len];
		//初始化数组
		for (int i = 0; i < len; i++) {
			hash[i] = 0;
		}
		//第一遍遍历字符串，求出每个字符出现的次数
		
		for (int i = 0; i < len; i++) {
			hash[(pStr.charAt(i)%len)]++;
		}
		

		
		//第二遍遍历字符串，求出第一个只出现一次的字符，每次都是按照字符串的顺序遍历
		for (int i = 0; i < len; i++) {
			if(hash[(pStr.charAt(i)%len)] == 1)
				return pStr.charAt(i);
		}
		
		return '\0';
	}

}
