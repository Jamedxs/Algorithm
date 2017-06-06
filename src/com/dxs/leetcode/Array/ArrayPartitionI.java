package com.dxs.leetcode.Array;

import java.util.Arrays;

public class ArrayPartitionI {
	
	public static int arrayPairSum(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(i%2 == 0) res += nums[i];
		}
		return res;
	}
	public static void main(String[] args) {
		int[] nums = {1,4,2,3};
		System.out.println(arrayPairSum(nums));

	}

}
