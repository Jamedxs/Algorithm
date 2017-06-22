package com.dxs.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年6月22日 上午9:21:55
 * 
 */
public class InvertBinaryTree {
	 //递归代码
	 public static TreeNode invertTree(TreeNode root) {
	        if(root == null) return null;
	        TreeNode temp = root.left;
	        root.left = invertTree(root.right);
	        root.right = invertTree(temp);
	        return root;
	    }
	 //使用深度遍历
	 public static TreeNode invertTreeDFS(TreeNode root) {
	        if(root == null) return null;
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        stack.push(root);
	        
	        while (!stack.isEmpty()) {
				//从栈中推出节点  使用temp交换左右节点
	        	//当前节点
	        	TreeNode node = stack.pop();
	        	//交换节点temp
	        	TreeNode temp = node.left;
	        	node.left = node.right;
	        	node.right = temp;
	        	
	        	if(node.left != null){
	        		stack.push(node.left);
	        	}
	        	if(node.right != null){
	        		stack.push(node.right);
	        	}
			}
	        return root;
	   }
	 //广度遍历
	 public static TreeNode invertTreeBFS(TreeNode root) {
	        if(root == null) return null;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.offer(root);
	        
	        while (!queue.isEmpty()) {
	        	int size = queue.size();
	        	while(size-- > 0){
	        		TreeNode node = queue.poll();
					TreeNode temp = node.left;
					node.left = node.right;
					node.right = temp;
					
					if(node.left != null){
						queue.offer(node.left);
					}
					if(node.right != null){
						queue.offer(node.right);
					}
	        	}
				
			}
	        return root;
	    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		TreeNode invertTreeRoot = invertTreeBFS(root);
		System.out.println(invertTreeRoot);
	}

}
