package com.dxs.leetcode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月7日 上午9:17:25
 * 
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])){
				return true;
			}else{
				set.add(nums[i]);
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
