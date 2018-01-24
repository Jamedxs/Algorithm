package com.dxs.leetcode.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dengxusheng on 2018-01-24.
 * 解析：分析数组 [[1,2,3,4],[5,1,2,3],[9,5,1,2]]    换算成下标可以知道  从左上到右下斜线上下标之差B都是相同的，就可以将B设置为map的key  value就为数组中的值。
 */
public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Integer temp = map.getOrDefault(i-j,matrix[i][j]);
                if(temp != matrix[i][j]){
                    return false;
                }
                map.put(i-j,matrix[i][j]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,4,4},{5,1,2,3},{9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
}
