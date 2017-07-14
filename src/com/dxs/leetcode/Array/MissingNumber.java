package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月14日 上午9:49:17
 *  Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
	For example,
	Given nums = [0, 1, 3] return 2.
	Note:
	Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
	Credits:
	Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.
	解析：由于没说数组是否有序，姑且认为是无序的，利用异或(XOR)的特性，A与0异或为A，A与A异或为0，异或具有传递性。一次for循环在O(n)时间内即可找出缺失的数字。

 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
        int res = nums.length;
		for (int i = 0; i < nums.length; i++) {
			res ^= i;
			res ^= nums[i];
		}
		
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
