package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月21日 上午9:49:32
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
	Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
	Example 1:
	
	Input: [1,3,2,2,5,2,3,7]
	Output: 5
	Explanation: The longest harmonious subsequence is [3,2,2,2,3].
	Note: The length of the input array will not exceed 20,000.

	解析：定义一个和谐数组，要求最大值和最小值的差不超过1.现在给出一个数组，要找出最长的和谐数组。
	我的想法是利用map，将每个key都存在map中并计数为value，如果存在则value++；
	 然后遍历key，看key+1 在整个keySet中是否存在，如果存在则判断res和 map.get(key)+map.get(key+1) 哪个更大一些。

 */
public class LongestHarmoniousSubsequence {
	public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res = 0;
        for (int num : nums) {
			Integer k = map.get(num);
			if(k == null){
				map.put(num, 1);
			}else{
				map.put(num, k+1);
			}
		}
        
        for (int key : map.keySet()) {
			if(map.containsKey(key+1)){
				res = Math.max(res, map.get(key)+map.get(key+1));
			}
		}
        return res;
    }
	
	public int findLHS2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int res = 0;
        for (int num : nums) {
			Integer k = map.get(num);
			if(k == null){
				map.put(num, 1);
			}else{
				map.put(num, k+1);
			}
			
			if (map.containsKey(num + 1))
                res = Math.max(res, map.get(num) + map.get(num + 1));
            if (map.containsKey(num - 1))
                res = Math.max(res, map.get(num) + map.get(num - 1));
		}
        
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
