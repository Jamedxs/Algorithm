package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月29日 上午9:55:00
 * 
 */
public class BinaryTreeTilt {
	int res = 0;
	//递归
	public int findTilt(TreeNode root) {
		binaryTreeTilt(root);
        
        return res;
    }
	
	public int binaryTreeTilt(TreeNode root){
		if(root == null) return 0;
		int left = binaryTreeTilt(root.left);
		int right = binaryTreeTilt(root.right);
		
		res += Math.abs(left - right);
		
		return left + right + root.val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
