package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月12日 上午9:46:24
 * 
 */
public class ReshapeTheMatrix {
	
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] a = new int[r][c];
        //行
        int rows = nums.length;
        //列
        int col = nums[0].length;
        if(rows * col != r * c) return nums;
        //二维数组转成一维数组
        int[] n = new int[rows * col];
        int index = 0;
        for (int[] element : nums) {
            for (int element2 : element) {
                n[index++] = element2;
            }
        }
        int k = 0;
        for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = n[k++];
			}
		}
        
		return a;
    }
	public static void main(String[] args) {
		int[][] nums = {{1,2},{3,4}};
		System.out.println(matrixReshape(nums, 1, 4));
	}

}
