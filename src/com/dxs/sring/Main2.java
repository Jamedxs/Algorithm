package com.dxs.sring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.CancelablePrintJob;

/**
 * @author dengxusheng
 * 2015年9月19日
 */
public class Main2 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		//int[] nums = new int[n];
		List arraylist = new ArrayList();
		for (int i = 0; i < n; i++) {
			//nums[i] = cin.nextInt();
			arraylist.add(cin.nextInt());
		}
		
		System.out.println(maxValue(arraylist, n));
	}
	
	public static int maxValue(List arraylist,int n){
		//int[] newNums = new int[n-1];
		int min = calc(arraylist);
		for (int i = 1; i < n-1; i++) {
			arraylist.remove(i);
			int k = calc(arraylist);
			if(k <= min ) {
				min = k;
			}
			
		}
		return min;
	}
	
	public static int calc(List arraylist){
		int max = 0;
		for (int i = 0; i < arraylist.size(); i++) {
			int k = (Integer)arraylist.get(i+1) - (Integer)arraylist.get(i);
			if(k >= max){
				max = k;
			}
		}
		return max;
	}
	
}
