package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月16日 上午9:37:27
 * Given a binary tree, determine if it is height-balanced.
	For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
	
	解析：判断平衡二叉树是否高度平衡的。平衡二叉树每个子节点高度不超过1。利用递归的方法来进行求解。
 */
public class BalancedBinaryTree {

	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int left,right;
        left = judgeHight(root.left);
        right = judgeHight(root.right);
        
        if((left > right + 1) || (right > left + 1)){
        	return false;
        }else{
        	return isBalanced(root.left) && isBalanced(root.right);
        }
        	
    }
	
	private int judgeHight(TreeNode root){
		if(root == null) return 0;
		int left = judgeHight(root.left);
		int right = judgeHight(root.right);
		
		return 1+(left>right?left:right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
