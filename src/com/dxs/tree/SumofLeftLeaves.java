package com.dxs.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月30日 上午10:18:44
 * 
 */
public class SumofLeftLeaves {
	
	//递归
	public int sumOfLeftLeaves(TreeNode root) {
		int res = 0;
		if(root == null) return 0;
		if(root.left != null){
			if(root.left.left == null && root.left.right == null){
				res += root.left.val;
			}else{
				res += sumOfLeftLeaves(root.left);
			}
			
		}
		
		res += sumOfLeftLeaves(root.right);
		
		return res;
    }
	
	//深度遍历
	public int sumOfLeftLeavesDFS(TreeNode root) {
		int res = 0;
		if(root == null) return 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode node = stack.pop();
			
			if(node.left != null){
				if(node.left.left == null && node.left.right == null){
					res += node.left.val;
				}
				stack.push(node.left);
			}
			if(node.right != null){
				stack.push(node.right);
			}
		}
		return res;
    }
	//广度遍历
	public int sumOfLeftLeavesBFS(TreeNode root) {
		int res = 0;
		if(root == null) return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size-- > 0){
				TreeNode node = queue.poll();
				if(node.left != null){
					if(node.left.left == null && node.left.right == null){
						res += node.left.val;
					}
					queue.offer(node.left);
				}
				if(node.right != null){
					queue.offer(node.right);
				}
			}
		}
		return res;
    }
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
	}

}
