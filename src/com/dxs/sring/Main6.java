package com.dxs.sring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年10月15日
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int n = cin.nextInt();
		while(cin.hasNextLine()){
			list.add(cin.nextLine());
		}
		
		System.out.println(mnTureFalse(list,n));
		
	}
	
	private static boolean mnTureFalse(List<String> list,int n){
		boolean boolResult = false;
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if("true".equals(str) || "TRUE".equals(str)){
				sum++;
			}
		}
		if(sum == n){
			boolResult = true;
		}
		
		
		return boolResult;
	}
		
	
	
}
