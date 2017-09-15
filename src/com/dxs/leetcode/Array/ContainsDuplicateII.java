package com.dxs.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dengxusheng on 2017-09-15.
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 解析：在之前做过 【AC】Contains Duplicate 这道题，现在这道题要求相同的两个数的下表不超过k才可以返回true。利用map来求解就方便多了。
 */
public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int j = map.get(nums[i]);
                if(Math.abs((i-j)) <= k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
}
