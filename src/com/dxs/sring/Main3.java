package com.dxs.sring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author dengxusheng
 * 2015年9月24日
 */
public class Main3 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		
		System.out.println(yiJiaoTu(n, k));
	}
	
	public static int[] yiJiaoTu(int n ,int k){
		int N = 2*n;
		int[] nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = 1;
		}
		int s = 0;
		for (int i = 2; i < N; i++) {
			nums[s=(s+k)%i] = 0;
		}
		
		
		return nums;
	}
}
