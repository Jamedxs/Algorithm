package com.dxs.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng
 * 2015-5-29
 */
public class LongestConsecutiveSequence {
	
	public static void main(String[] args) {
		int[] nums = {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		
		int len = nums.length;
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int longest = 0;
		for (int i = 0; i < len; i++) {
			map.put(nums[i], false);
		}
		
		for (int i = 0; i < len; i++) {
			if(map.get(nums[i])) continue;
			
			int length = 1;
			map.put(nums[i], true);
			
			for (int j = nums[i] + 1; map.containsKey(j); j++) {
				map.put(j, true);
				length++;
			}

			for (int j = nums[i] - 1; map.containsKey(j); j--) {
				map.put(j, true);
				length++;
			}
			longest = Math.max(longest, length);
		}
		return longest;
	}
}
