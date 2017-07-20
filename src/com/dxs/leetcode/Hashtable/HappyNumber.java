package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月20日 上午10:30:14
 * Write an algorithm to determine if a number is "happy".
	A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
	Example: 19 is a happy number

	* 12 + 92 = 82
	* 82 + 22 = 68
	* 62 + 82 = 100
	* 12 + 02 + 02 = 1
	解析：happy数，如果最后为，返回true，如果循环回已经计算过的数，返回false；
 */
public class HappyNumber {
	public static boolean isHappy(int n) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        while(true){
        	String str = String.valueOf(n);
        	int res = 0;
        	for (int i = 0; i < str.length(); i++) {
				int k = Integer.valueOf(str.charAt(i)-'0');
				res += k * k;
			}
        	
        	if(res == 1){
        		return true;
        	}else if(map.containsKey(res)){
        		return false;
        	}else{
        		map.put(res, n);
        	}
        	
        	n = res;
        }
        
    }
	public static void main(String[] args) {
		int n = 19;
		System.out.println(isHappy(n));
	}

}
