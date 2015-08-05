package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dengxusheng 
 * 2015年7月21日
 * 
 *         Given an array S of n integers, are there elements a, b, c in S such
 *         that a + b + c = 0? Find all unique triplets in the array which gives
 *         the sum of zero. Note: • Elements in a triplet ( a, b, c ) must be in
 *         non-descending order. (ie, a ≤ b ≤ c) • The solution set must not
 *         contain duplicate triplets. For example, given array S = {-1 0 1 2 -1
 *         -4}. A solution set is: (-1, 0, 1) (-1, -1, 2)
 */
public class Sum3 {
	
	public static void main(String[] args) {
		//int[] nums = {-1,0,1,2,-1,-4};
		//int[] nums = {-2,0,0,2,2};
		int[] nums = {0,0,0};
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = threeSum(nums);
		System.out.println("111");
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list;

		int len = nums.length;
		if(len < 3) return result;
		Arrays.sort(nums);
		int target = 0;
		for (int i = 0; i < len-2; i++) {
			if(i > 0 && nums[i] == nums[i-1]) continue;
			int j = i + 1;
			int k = len-1;
			while(j < k){
				if((nums[i]+nums[j]+nums[k]) < target){
					j++;
					while(nums[j] == nums[j-1] && j < k) ++j;
				}else if((nums[i]+nums[j]+nums[k]) > target){
					k--;
					while(nums[k] == nums[k+1] && j < k) --k;
				}else{
					list = new ArrayList<Integer>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					result.add(list);
					j++;
					k--;
					while(nums[j] == nums[j-1] && nums[k] == nums[k+1] && j < k) j++;
				}
			}
		}
		
		return result;
	}
}
