package com.dxs.leetcode.Array;

import java.util.Arrays;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月29日 上午9:30:24
 * 
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.
	Example:
	Input:
	[1,2,3]
	Output:
	3
	Explanation:
	Only three moves are needed (remember each move increments two elements):
	[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
	解析：求一个非空int数组，增加多少次可以使数组平衡，每次最多增加n-1次，只能增加1。
	自己写几个数组，多计算几次既可以找出规律，先找到最小的数，然后增加次数就是与其他数的差值的和。
 */
public class MinimumMovestoEqualArrayElements {
	public static int minMoves(int[] nums) {
		int count = 0;
		if(nums.length == 0) return count;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
			count += Math.abs(nums[i] - nums[0]);
		}
        return count;
    }
	
	public static int minMoves2(int[] nums) {
        int count = 0;
        if(nums.length == 0) return count;
        int min = nums[0];
        for (int i : nums) {
			min = Math.min(min, i);
		}
        for (int i : nums) {
			count += i - min;
		}
        return count;
    }
	public static void main(String[] args) {
		int[] nums = {83,86,77,15,93,35,86,92,49,21};
		System.out.println(minMoves(nums));
	}

}
