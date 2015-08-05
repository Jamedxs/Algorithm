package com.dxs.leetcode.Array;
/**
 * @author dengxusheng
 * 2015年7月24日
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
	
	public int removeElement(int[] nums, int val) {
		int index = 0;
		int length = nums.length;
		if(length <= 0) return 0;
		for (int i = 0; i < length; i++) {
			if(nums[i] != val)
				nums[index++] = nums[i];
		}
		
		return index;
	}
}
