package com.dxs.leetcode.Hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月11日 上午10:05:45
	Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
	Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
	Example:
	Input:
	[[0,0],[1,0],[2,0]]
	Output:
	2
	Explanation:
	The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
	解析：给出一个3行2列的二维数组，给出(i,j,k)如果i行到j行的距离等于i行到k行的距离，那么这就是一个”回旋镖“。判断这个二维数组中有多少个回旋镖。
	两个for循环遍历二维数组，当行相等的时候，跳过此次循环，进入下次循环。然后计算出points[行1]和points[行2]的距离，将其放到map中，距离为key，如果key存在则+1，不存在则为1。
	排队组合的方式将所有的组合都循环结束，每一次内层for循环结束后，res= val*（val-1）
 */
public class NumberofBoomerangs {
	public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points.length; j++) {
				if(i == j)
					continue;
				
				int distance = getDistance(points[i], points[j]);
				Integer k = map.get(distance);
				if(k == null){
					map.put(distance, 1);
				}else{
					map.put(distance, k+1);
				}
			}
			
			for(int val : map.values()) {
	            res += val * (val-1);
	        }            
	        map.clear();
		}
        
        return res;
    }
	
	private static int getDistance(int[] a, int[] b) {
	    int x = a[0] - b[0];
	    int y = a[1] - b[1];
	    return x*x + y*y;
	}
	
	public static void main(String[] args) {
		int[][] points = {{0,0},{1,0},{2,0}};
		System.out.println(numberOfBoomerangs(points));
	}

}
