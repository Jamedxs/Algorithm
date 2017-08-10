package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月10日 上午10:53:39
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.
	Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.
	Example 1:
	
	Input: nums = [1,2,2,4]
	Output: [2,3]
	Note:
	1. The given array size will in the range [2, 10000].
	2. The given array's numbers won't have any order.
	解析：使用map来计数，然后遍历i到nums.length 判断那个是重复的，哪个是缺失的。

 */
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int duplicate = -1,missing = 1;
        for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
        for (int i = 1; i <= nums.length; i++) {
			if(map.containsKey(i)){
				if(map.get(i) == 2){
					duplicate = i;
				}
			}else{
				missing = i;
			}
		}
        
        return new int[]{duplicate,missing};
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
