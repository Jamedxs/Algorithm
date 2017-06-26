package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月26日 上午9:37:00
 * 
 */
public class MinimumIndexSumofTwoLists {
	public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> linkedList = new LinkedList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < list2.length; i++) {
			map.put(list2[i], i);
		}
		for (int i = 0; i < list1.length; i++) {
			Integer j = map.get(list1[i]);
			if(j != null && (i+j) <= min){
				if(i+j < min){
					linkedList = new LinkedList<String>();
					min = i + j;
				}
				linkedList.add(list1[i]);
			}
		}
        
        return linkedList.toArray(new String[linkedList.size()]);
    }
	
	public static void main(String[] args) {
		String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
		System.out.println(findRestaurant(list1,list2));
		
	}

}
