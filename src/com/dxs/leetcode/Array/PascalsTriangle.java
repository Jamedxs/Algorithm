package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月4日 上午9:19:44
 * Given numRows, generate the first numRows of Pascal's triangle.
	For example, given numRows = 5,
	Return
	[
	     [1],
	    [1,1],
	   [1,2,1],
	  [1,3,3,1],
	 [1,4,6,4,1]
	]
	解析：两个上一个向加为下一个。
 */
public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> resList = new ArrayList<List<Integer>>();
		if(numRows <= 0) return resList;
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		resList.add(list);
		
		for (int i = 2; i <= numRows; i++) {
			List<Integer> currentList = new ArrayList<Integer>();
			currentList.add(1);
			for (int j = 0; j < list.size()-1; j++) {
				currentList.add(list.get(j)+list.get(j+1));
			}
			currentList.add(1);
			resList.add(currentList);
			list = currentList;
		}
		return resList;
    }
	public static void main(String[] args) {
		int numRows = 5;
		System.out.println(generate(numRows));
	}

}
