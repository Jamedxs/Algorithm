package com.dxs.leetcode.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月28日 上午10:26:30
 * Given two arrays, write a function to compute their intersection.
	Example:
	Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
	Note:
	* Each element in the result must be unique.
	* The result can be in any order.
	解析：求两个数组的并集，要求不允许有重复的元素。首先想到用map，但是用map浪费了key或者value的空间，再想一下可以用set来实现。
 */
public class IntersectionofTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nums1Map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> nums2Map = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < nums1.length; i++) {
        	nums1Map.put(i, nums1[i]);
		}
        int count = 0;
        for (int j = 0; j < nums2.length; j++) {
			if(nums1Map.containsValue(nums2[j]) && !nums2Map.containsKey(nums2[j])){
				nums2Map.put(nums2[j], j);
				count++;
			}
		}
        int[] res = new int[count];
        int k = 0;
        for (Integer key : nums2Map.keySet()) {
        	res[k++] = key;
		}
        
        return res;
    }
	public static int[] intersection2(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
        Set<Integer> intersect = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                intersect.add(nums2[i]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		System.out.println(intersection(nums1,nums2));
	}

}
