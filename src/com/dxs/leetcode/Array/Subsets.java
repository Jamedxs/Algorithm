package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dengxusheng
 * 2015年8月28日
 */
public class Subsets {
	
	public static void main(String[] args) {
		int[] nums = {1,3,2,4};
		System.out.println(subsets(nums));
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list;
		Arrays.sort(nums);
		int length = nums.length;
		for (int i = 0; i < 1<<length; i++) {
			list = new ArrayList<Integer>();
			for (int j = 0; j < length; j++) {
				if( (i & 1 << j) != 0 )
					list.add(nums[j]);
			}
			result.add(list);
		}
		
		return result;
	}
}
