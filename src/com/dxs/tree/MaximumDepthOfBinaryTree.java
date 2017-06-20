package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月20日 上午9:51:57
 * 
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		int i = 0;
		int j = 0;
        if(root == null) return 0;
        if(root.left != null){
        	i = maxDepth(root.left);
        }
        if(root.right != null){
        	j = maxDepth(root.right);
        }
        return i > j ? i+1:j+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
