package com.dxs.leetcode.Array;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月3日 上午11:34:30
 * 
 */
public class RelativeRanks {
	public static String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        
        int[][] pair = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        
        //此方法为jdk1.8的
        //Arrays.sort(pair, (a, b) -> (b[0] - a[0]));
        
        for (int i = 0; i < nums.length; i++) {
        	if(i == 0){
        		res[pair[i][1]] = "Gold Medal";
        	}else if(i == 1){
        		res[pair[i][1]] = "Silver Medal";
        	}else if(i == 2){
        		res[pair[i][1]] = "Bronze Medal";
        	}else{
        		res[pair[i][1]] = (i + 1) + "";
        	}
			
		}
        
        return res;
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
