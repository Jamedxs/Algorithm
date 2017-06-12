package com.dxs.leetcode.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月12日 下午3:21:38
 * 
 */
public class FizzBuzz {
	public static List<String> fizzBuzz(int n) {
		if(n < 1) return null;
		List<String> list = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				list.add("FizzBuzz");
			}else if(i % 3 == 0){
				list.add("Fizz");
			}else if(i % 5 == 0){
				list.add("Buzz");
			}else{
				list.add(String.valueOf(i));
			}
		}
		
		return list;
    }
	public static void main(String[] args) {
		int n = 15;
		List<String> list = fizzBuzz(n);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
