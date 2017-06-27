package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月27日 上午10:48:13
 * 
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
	You may assume that each input would have exactly one solution and you may not use the same element twice.
	Input: numbers={2, 7, 11, 15}, target=9
	Output: index1=1, index2=2
 * 
 * 
 */
public class TwoSumIIInputarrayissorted {
	
	//超时
	public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int length = numbers.length;
        if(numbers == null || length == 0) return res;
        
        for (int i = 0; i < length; i++) {
			int k = target - numbers[i];
			for (int j = i+1; j < length; j++) {
				if(k == numbers[j]){
					res[0] = i+1;
					res[1] = j+1;
					break;
				}
			}	
		}
        return res;
    }
	
	public static int[] twoSum2(int[] numbers, int target) {
        int[] res = new int[2];
        int length = numbers.length;
        if(numbers == null || length == 0) return res;
        
        for (int i = 0; i < length; i++) {
			int k = target - numbers[i];
			//二分查找
			int left = i + 1;
			int right = length-1;
			while(left <= right){
				int mid = (left + right) / 2;
				if(k == numbers[mid]){
					res[0] = i+1;
					res[1] = mid+1;
					break;
				}else if(k > numbers[mid]){
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}
		}
        return res;
    }
	
	public static int[] twoSum3(int[] numbers, int target) {
        int[] res = new int[2];
        int length = numbers.length;
        if(numbers == null || length == 0) return res;
        //直接二分查找
        int left = 0;
		int right = length-1;
		while(left <= right){
			int sum = numbers[left] + numbers[right];
			if(target == sum){
				res[0] = left+1;
				res[1] = right+1;
				break;
			}else if(target > sum){
				left++;
			}else{
				right--;
			}
		}
        
        return res;
    }
	public static void main(String[] args) {
		int[] numbers={2,3,4};
		int target=6;
		System.out.println(twoSum2(numbers,target));
	}

}
