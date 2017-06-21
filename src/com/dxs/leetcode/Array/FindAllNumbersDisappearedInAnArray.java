package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月21日 上午10:05:26
 * 
 */
public class FindAllNumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		//将Array中的值变成序号,并将其值变成负数  nums[nums[i] -1] = -nums[nums[i] -1]
		for (int i = 0; i < nums.length; i++) {
			int k = Math.abs(nums[i]) - 1;
			if(nums[k] > 0){
				nums[k] = -nums[k];
			}
		}
		//遍历数组 如果值大于0 则表示改序号没有在Array的值中出现过
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > 0){
				list.add(i+1);
			}
		}
		return list;
    }
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}

}
