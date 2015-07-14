package com.dxs.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng
 * 2015年7月10日
 */
public class TwoSum {
	
	public static void main(String[] args) {
		int[] nums = {-1,-2,-3,-4,-5};
		int target = -8;
		int result[]={};
		result = twoSum(nums,target);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result[] = {0,0};
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int j = target - nums[i];
			if(map.containsKey(j) && map.get(j)!= i){
				result[0] = i + 1;
				result[1] = (int)map.get(j) + 1;
				break;
			}
		}
        return result;
    }
}
