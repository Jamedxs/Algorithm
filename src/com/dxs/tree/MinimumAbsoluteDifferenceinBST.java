package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月27日 下午3:57:08
 * 
 */
public class MinimumAbsoluteDifferenceinBST {
	int min = Integer.MAX_VALUE;
    
    Integer prev = null;
	public int getMinimumDifference(TreeNode root) {
        
        
        if(root == null) return min;
        
        getMinimumDifference(root.left);
        
        if(prev != null){
        	min = Math.min(min, root.val - prev);
        }
        
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
