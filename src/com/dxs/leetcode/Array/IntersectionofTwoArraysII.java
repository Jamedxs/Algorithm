package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月13日 上午10:42:19
 * Given two arrays, write a function to compute their intersection.
Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
Note:
	* Each element in the result should appear as many times as it shows in both arrays.
	* The result can be in any order.
Follow up:
	* What if the given array is already sorted? How would you optimize your algorithm?
	* What if nums1's size is small compared to nums2's size? Which algorithm is better?
	* What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

解析：求两个数组的交集，可以重复。在之前做【Number of Boomerangs】这道题的时候，用一个map中存重复的key，将value++。这样的话，在遍历第二个数组的时候，就可以直到在第一个数组中存在的次数。将其加到list中，然后在转为数组。

	* What if the given array is already sorted? How would you optimize your algorithm?

答：如果给定的数组已经排序，那么应该使1数组中的元素2中进行折半查找，这样就可以节省时间。

 */
public class IntersectionofTwoArraysII {
	public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> numsMap1 = new HashMap<Integer,Integer>();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < nums1.length; i++) {
        	Integer k = numsMap1.get(nums1[i]);
        	if(k == null){
        		numsMap1.put(nums1[i], 1);
        	}else{
        		numsMap1.put(nums1[i], k+1);
        	}
		}
        
        for (int i = 0; i < nums2.length; i++) {
			Integer k = numsMap1.get(nums2[i]);
        	if(k != null && k > 0){
        		list.add(nums2[i]);
        		numsMap1.put(nums2[i], k-1);
        	}
		}
        
        
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
        
        return res;
        
    }
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2,2};
		System.out.println(intersect(nums1,nums2));
	}

}
