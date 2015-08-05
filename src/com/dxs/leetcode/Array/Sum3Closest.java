package com.dxs.leetcode.Array;

import java.util.Arrays;

/**
 * @author dengxusheng
 * 2015年7月22日
 */


public class Sum3Closest {
	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target = 1;
		System.out.println(threeSumClosest(nums,target));
	}

	public static int threeSumClosest(int[] nums, int target) {
		int result = 0;
		int min = 2147483647;
		int len = nums.length;
		if(len < 3) return result;
		Arrays.sort(nums);
		for (int i = 0; i < len; i++) {
			int j = i+1;
			int k = len-1;
			while(j < k){
				int sum = nums[i] + nums[j] + nums[k];
				int gap = Math.abs(sum-target);
				if(gap < min){
					result = sum;
					min = gap;
				}
				if(sum<target) j++;
				else k--;
			}
		}
		
		return result;
	}
}
