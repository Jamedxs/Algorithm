package com.dxs.leetcode.Hashtable;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月14日 下午4:58:24
 * 
 */
public class IslandPerimeter {
	public static int islandPerimeter(int[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] == 1){
					res += 4;
					//判断当前单元格上和左是否有，如果有则周长-2
					if(i > 0 && grid[i-1][j] == 1) res -= 2;
					if(j > 0 && grid[i][j-1] == 1) res -= 2;
				}
			}
		}
        return res;
    }
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},
				 		{1,1,1,0},
				 		{0,1,0,0},
				 		{1,1,0,0}};
		
		System.out.println(islandPerimeter(grid));

	}

}
