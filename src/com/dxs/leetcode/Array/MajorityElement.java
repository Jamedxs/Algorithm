package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月4日 上午11:19:19
 * 
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
		int element = 0;
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(count == 0){
				count++;
				element = nums[i];
			}else if(element == nums[i]){
				count ++;
			}else{
				count --;
			}
		}
		return element;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
