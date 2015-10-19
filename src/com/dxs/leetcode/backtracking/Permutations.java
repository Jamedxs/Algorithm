package com.dxs.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dengxusheng
 * 2015年8月24日
 * 
 * Given a collection of numbers, return all possible permutations.

	For example,[1,2,3] have the following permutations:[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 
 *
 *	利用已经做过的  next permutation 那道题的思想
 */
public class Permutations {
	
	public static void main(String[] args) {
		int[] nums = {3,1,2};
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = permute(nums);
		System.out.println(list);
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		result.add(numsToList(nums));
		for (int i = 1; i < factorial(nums.length); i++) {
			nextPermutation(nums);
			result.add(numsToList(nums));
		}
		
		return result;
	}
	
	//计算阶乘
	public static int factorial(int num){
		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum *= i;
		}
		return sum;
	}
	//将nums中的数组添加到 list中
	public static List<Integer> numsToList(int[] nums){
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			list.add(nums[i]);
		}
		
		return list;
	}
	
	public static void nextPermutation(int[] nums) {
		int len = nums.length;
		//升序位置
		int pos = -1;
		//找到升序位置
		for (int i = len-1; i > 0; i--) {
			if(nums[i] > nums[i-1]){
				pos = i-1;
				break;
			}
		}
		
		//如果没有升序，则是逆序，直接反转
		if(pos < 0){
			reverse(nums,0,len-1);
			return;
		}
		
		for (int i = len-1; i > pos; i--) {
			if(nums[i] > nums[pos]){
				exch(nums,i,pos);
				break;
			}
				
		}
		
		reverse(nums,pos+1,len-1);
	}
	
	public static void exch(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}
	
	public static void reverse(int[] nums,int first,int last){
		while(first < last){
			int temp = nums[first];
			nums[first++] = nums[last];
			nums[last--] = temp;
		}
	}

}
