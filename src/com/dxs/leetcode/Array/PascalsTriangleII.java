package com.dxs.leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月16日 上午10:30:18
 * Given an index k, return the kth row of the Pascal's triangle.
	For example, given k = 3,
	Return [1,3,3,1].
	Note:
	Could you optimize your algorithm to use only O(k) extra space?
	
	
	解析：参考帕斯卡三角形I 里面的解法，只要输出当前行就行了。

 */
public class PascalsTriangleII {
	
	
	public static List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if(rowIndex < 0) return list;
		list.add(1);
		
		for (int i = 1; i <= rowIndex; i++) {
			List<Integer> currentList = new ArrayList<Integer>();
			currentList.add(1);
			for (int j = 0; j < list.size()-1; j++) {
				currentList.add(list.get(j) + list.get(j+1));
			}
			currentList.add(1);
			list = currentList;
		}
		
		return list;
    }
	
	public static void main(String[] args) {
		int rowIndex = 3;
		System.out.println(getRow(rowIndex));

	}

}
