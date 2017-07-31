package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月31日 上午9:52:57
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. And you need to output the maximum average value.
	Example 1:
	Input: [1,12,-5,-6,50,3], k = 4
	Output: 12.75
	Explanation: Maximum average is (12-5-6+50)/4 = 51/4 = 12.75
	Note:
	1. 1 <= k <= n <= 30,000.
	2. Elements of the given array will be in the range [-10,000, 10,000].
	解析：在一个数组中，找出连续k个数最大的平均值，就是先找出连续k个数的最大值。
	最简单的方法就是 O(n*k)  一个冒泡来寻找，见代码一。
	在看了他人答案之后，O（n）时间  O(1)的空间复杂度来进行实现，在第一次的时候先计算k个数的总和，然后在从低k+1个数开始加上第k+1个数，然后减掉第一个数，寻找最大值，见代码二。

 */
public class MaximumAverageSubarrayI {
	public static double findMaxAverage(int[] nums, int k) {
        int length = nums.length;
        if(k > length) return 0;
        double max = Integer.MIN_VALUE;
        for (int i = 0; i <= (length - k); i++) {
        	int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += nums[i+j];
			}
			if(max <= sum) max = sum;
		}
        return max/k;
    }
	
	public static double findMaxAverage3(int[] nums, int k) {
		double sum=0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        double res=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            res=Math.max(res,sum);
        }
        return res/k;
    }
	
	public static void main(String[] args) {
		int[] nums = {-1};
		System.out.println(findMaxAverage(nums,1));
	}

}
