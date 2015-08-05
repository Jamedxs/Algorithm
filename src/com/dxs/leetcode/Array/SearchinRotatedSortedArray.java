package com.dxs.leetcode.Array;

public class SearchinRotatedSortedArray {

	/**
	 * Suppose a sorted array is rotated at some pivot unknown to you beforehand
	 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2). You are given a target
	 * value to search. If found in the array return its index, otherwise return
	 * -1. You may assume no duplicate exists in the array.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int target = 1;
		System.out.println(search(nums,target));

	}
	
	public static int search(int[] nums,int target){
		int first = 0;
		int last = nums.length-1;
		while(first <= last){
			int mid = first + (last - first) / 2;
			if(nums[mid] == target)
				return mid;
			if(nums[first] <= nums[mid]){
				if(nums[first] <= target && target < nums[mid])
					last = mid;
				else
					first = mid + 1;
			}else{
				if(nums[mid] < target && target <= nums[last])
					first = mid + 1;
				else
					last = mid;
			}
		}
		return -1;
	}

}
