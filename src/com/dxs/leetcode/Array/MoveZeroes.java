package com.dxs.leetcode.Array;

public class MoveZeroes {
	
	public static void main(String[] args) {
		int[] nums = {1};
		moveZeroes(nums);
		System.out.println(nums);
	}
	
	public static void moveZeroes(int[] nums) {
		int length = nums.length;
		// 双指针，j走在i的前面。
		int i = 0;
		int j = 0;
		while (j < length) {
			if (nums[j] != 0) {
				if (j != i) {
					// 与nums[i]交换 并将nums[j]置为0
					nums[i++] = nums[j];
					nums[j] = 0;
				} else {
					i++;
				}
			}
			j++;
		}
	}
}
