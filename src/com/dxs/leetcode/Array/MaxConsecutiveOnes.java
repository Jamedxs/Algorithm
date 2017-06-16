package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月16日 下午3:14:22
 * 
 */
public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0 ) return 0;
        int max = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1){
				k++;
			}else{
				k = 0;
				continue;
			}
			
			if(k >= max) max = k;
		}
        return max;
    }
	public static void main(String[] args) {
		int[] nums = {1,0,1,1,0,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

}
