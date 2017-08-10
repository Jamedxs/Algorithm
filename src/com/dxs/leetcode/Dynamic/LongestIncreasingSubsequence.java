package com.dxs.leetcode.Dynamic;

import java.util.Arrays;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月10日 上午10:11:11
 * Given an unsorted array of integers, find the length of longest increasing subsequence.
	For example,
	Given [10, 9, 2, 5, 3, 7, 101, 18],
	The longest increasing subsequence is [2, 3, 7, 101], therefore the length is 4. Note that there may be more than one LIS combination, it is only necessary for you to return the length.
	Your algorithm should run in O(n2) complexity.
	Follow up: Could you improve it to O(n log n) time complexity?

	解析：动态规划初级题。具体请看 【算法导论】-动态规划

 */
public class LongestIncreasingSubsequence {
	//O(n^2)
	public static int lengthOfLIS(int[] nums) {
		if(nums == null || nums.length <= 0) return 0;
        int max = 1;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
			arr[i] = 1;
			for (int j = 0; j < i; j++) {
				if(nums[j] < nums[i] && arr[j]+1 > arr[i])
					arr[i] = arr[j] + 1;
			}
			if(arr[i] > max) max = arr[i];
		}
        return max;
    }
	//O(nlogn)
		public static int lengthOfLIS2(int[] nums) {
			if(nums == null || nums.length <= 0) return 0;
	        int[] arr = new int[nums.length];
	        int max = 0;
	        for (int num : nums) {
				int i = Arrays.binarySearch(arr, 0, max, num);
				if(i < 0){
					i = -(i + 1);
				}
				arr[i] = num;
				if(i == max){
					max++;
				}
			}
	        return max;
	    }
	public static void main(String[] args) {
		int[] nums = {2,2};
		System.out.println(lengthOfLIS(nums));
	}

}
