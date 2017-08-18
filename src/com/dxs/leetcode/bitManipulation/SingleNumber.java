package com.dxs.leetcode.bitManipulation;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月16日 下午3:31:20
 * 
 */
public class SingleNumber {
	public static int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
			res = res ^ nums[i];
		}
        return res;
    }
	public static void main(String[] args) {
		int[] nums = {2,3,4,5,4,3,2};
		System.out.println(singleNumber(nums));
	}

}
