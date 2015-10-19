package com.dxs.sring;

import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年9月19日
 */
public class Main1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int p = cin.nextInt();
		int n = cin.nextInt();
		
		 int[] xi = new int[n]; 
		 for (int i = 0; i < n; i++) { 
			 xi[i] = cin.nextInt(); 
		 }
		 
		 
		System.out.println(touLan(p,n,xi));
		

	}
	
	public static int touLan(int p,int n,int[] xi){
		int k = 0;
		boolean flag[] = new boolean[n];
		for (int i = 0; i < p; i++) {
			flag[i] = false;
		}
		for (int i = 0; i < n; i++) {
			if(flag[(xi[i]%p)] == true){
				return i+1;
			}else{
				flag[(xi[i]%p)] = true;
			}
		}
		return -1;
	}
	
	
}
