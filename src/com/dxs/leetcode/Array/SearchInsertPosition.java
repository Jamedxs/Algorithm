package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月27日 上午9:09:16
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	You may assume no duplicates in the array.
	Here are few examples.
	[1,3,5,6], 5 → 2
	[1,3,5,6], 2 → 1
	[1,3,5,6], 7 → 4
	[1,3,5,6], 0 → 0
	
	解析：二分搜索。
 */
public class SearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if(nums == null || length <= 0) return 0;
        int left = 0;
        int right = length - 1;
        
        while(left <= right){
        	int mid = (left + right)/2; 
        	if(target == nums[mid]) return mid;
        	if(target < nums[mid]){
        		right = mid - 1;
        	}else{
        		left = mid + 1;
        	}
        }
        return left;
    }
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		System.out.println(searchInsert(nums,target));
	}

}
