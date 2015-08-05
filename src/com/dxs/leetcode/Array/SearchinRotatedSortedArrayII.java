package com.dxs.leetcode.Array;

public class SearchinRotatedSortedArrayII {

	/**
	 * Follow up for ”Search in Rotated Sorted Array”: What if duplicates are
	 * allowed? Would this affect the run-time complexity? How and why? Write a
	 * function to determine if a given target is in the array 
	 * 允许重复元素，则上一题中如果
	 * A[m]>=A[l] , 那么 [l,m] 为递增序列的假设就不能成立了，比 如 [1,3,1,1,1] 。 如果 A[m]>=A[l]
	 * 不能确定递增，那就把它拆分成两个条件： • 若 A[m]>A[l] ，则区间 [l,m] 一定递增 • 若 A[m]==A[l] 确定不了，那就
	 * l++，往下看一步即可。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,3};
		int target = 3;
		System.out.println(search(nums,target));
	}
	
	public static boolean search(int[] nums,int target){
		int first = 0;
		int last = nums.length-1 ;
		while(first <= last){
			int mid = first + (last - first) / 2;
			if(nums[mid] == target)
				return true;
			if(nums[first] < nums[mid]){
				if(target >= nums[first] && target < nums[mid])
					last = mid;
				else
					first = mid + 1;
			}else if(nums[first] > nums[mid]){
				if(target > nums[mid] && target <= nums[last])
					first = mid + 1;
				else
					last = mid;
			}else{
				//nums[first]=nums[mid]跳过重复元素
				first++;
			}
			
		}
		return false;
	}
}
