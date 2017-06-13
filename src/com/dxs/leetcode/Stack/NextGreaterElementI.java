package com.dxs.leetcode.Stack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月13日 上午11:24:57
 * 
 */
public class NextGreaterElementI {
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		for (int i = 0; i < findNums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(findNums[i] == nums[j] ){
					if(j+1 >= nums.length){
						findNums[i] = -1;
					}else{
						for (int k = j + 1; k < nums.length; k++) {
							if(findNums[i] < nums[k]){
								findNums[i] = nums[k];
								break;
							}else if(k == nums.length -1){
								findNums[i] = -1;
							}else{
								continue;
							}
						}
					}
					break;	
				}
					
			}
		}
		return findNums;
    }
	/*public static int[] nextGreaterElement2(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<Integer>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
        	findNums[i] = map.getOrDefault(findNums[i], -1);
        	
        return findNums;
	}*/
	public static void main(String[] args) {
		//int[] findNums = {1,3,5,2,4};
		//int[] nums = {6,5,4,3,2,1,7};
		int[] findNums = {4,1,2};
		int[] nums = {1,3,4,2};
		int[] res = nextGreaterElement(findNums,nums);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
