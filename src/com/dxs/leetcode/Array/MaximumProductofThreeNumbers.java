package com.dxs.leetcode.Array;

import java.util.Arrays;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月6日 上午10:10:33
 * 
 */
public class MaximumProductofThreeNumbers {
	public static int maximumProduct(int[] nums) {
		if(nums.length == 0) return 0;
		Arrays.sort(nums);
		
		int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        
        return a > b ? a : b;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(maximumProduct(nums));
	}

}
