package com.dxs.leetcode.Array;

/**
 * @author dengxusheng 2015年7月24日 
 * Implement next permutation, which rearrangesnumbers into the lexicographically next greater 
 * permutation of  numbers.
 *  If such arrangement is not possible, it must rearrange it as the
 *  lowest possible order (ie, sorted in ascending order).
 *  The replacement must be in-place, do not allocate extra memory.
 *  Here are some examples. Inputs are in the left-hand column and its
 *  corresponding outputs are in the right-hand column. 
 *  1,2,3 → 1,3,2
 *  3,2,1 → 1,2,3 
 *  1,1,5 → 1,5,1
 */
public class NextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,3,2};
		nextPermutation(nums);
	}
	public static void nextPermutation(int[] nums) {
		int len = nums.length;
		//升序位置
		int pos = -1;
		//找到升序位置
		for (int i = len-1; i > 0; i--) {
			if(nums[i] > nums[i-1]){
				pos = i-1;
				break;
			}
		}
		
		//如果没有升序，则是逆序，直接反转
		if(pos < 0){
			reverse(nums,0,len-1);
			return;
		}
		
		for (int i = len-1; i > pos; i--) {
			if(nums[i] > nums[pos]){
				exch(nums,i,pos);
				break;
			}
				
		}
		
		reverse(nums,pos+1,len-1);
	}
	
	public static void exch(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp; 
	}
	
	public static void reverse(int[] nums,int first,int last){
		while(first < last){
			int temp = nums[first];
			nums[first++] = nums[last];
			nums[last--] = temp;
		}
	}
}
