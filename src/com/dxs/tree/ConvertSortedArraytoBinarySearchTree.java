package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年7月18日 上午9:36:25
 * 
 */
public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		
		return arrayToBST(nums,0,nums.length-1);
    }
	
	public TreeNode arrayToBST(int[] nums,int left,int right){
		
		if(left > right) return null;
		int mid = (left + right)/2;
		
		TreeNode node = new TreeNode(nums[mid]);
		
		node.left = arrayToBST(nums,left,mid-1);
		node.right = arrayToBST(nums,mid+1,right);
		
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
