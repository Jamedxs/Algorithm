package com.dxs.leetcode.Hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月9日 下午4:34:06
 * 
 */
public class DistributeCandies {

	public static int distributeCandies(int[] candies) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		//List<Integer> list = new ArrayList<Integer>();
		int length = candies.length;
		if(length < 2 || length > 10000) return 0;
		int res = 0;
        for (int i = 0; i < length; i++) {
        	
        	if(res >= length/2){
        		res = length/2;
        		break;
        	}
			if(!map.containsKey(candies[i])){
				map.put(candies[i],i);
				res++;
			}
			
		}
        return res;
    }
	public static int distributeCandies2(int[] candies) {
		List<Integer> list = new ArrayList<Integer>();
		int length = candies.length;
		int res = 0;
        for (int i = 0; i < length; i++) {
        	
        	if(res >= length/2){
        		res = length/2;
        		break;
        	}
			if(!list.contains(candies[i])){
				list.add(candies[i]);
			}
			res = list.size();
			
		}
        return res;
    }
	public static void main(String[] args) {
		int[] candies = {1,1,2,2,3,3};
		System.out.println(distributeCandies(candies));
	}

}
