package com.dxs.tree;

import java.util.Stack;

import sun.org.mozilla.javascript.internal.Node;

/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月2日 上午9:36:54
 * 
 */
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return judgeSymmetric(root.left,root.right);
    }
	
	public boolean judgeSymmetric(TreeNode left,TreeNode right) {
		if(left == null && right == null) return true;
        if((left == null && right != null) || (left != null && right == null) ||  (left.val != right.val)){
        	return false;
        }else{
        	return judgeSymmetric(left.left,right.right) && judgeSymmetric(left.right,right.left);
        }
		
    }
	
	
	public boolean isSymmetric2(TreeNode root) {
        if((root == null) || (root.left == null && root.right == null) ) return true;
        Stack<TreeNode> stackLeft = new Stack<TreeNode>();
        Stack<TreeNode> stackRight = new Stack<TreeNode>();
        stackLeft.push(root.left);
        stackRight.push(root.right);
        //boolean flag = false;
        while(!stackLeft.isEmpty() && !stackRight.isEmpty()){
        	TreeNode node1 = stackLeft.pop();
        	TreeNode node2 = stackRight.pop();
        	if((node1 == null && node2 != null) || (node1 != null && node2 == null) ||  (node1.val != node2.val)){
            	return false;
            }
        	if(node1.left != null && node2.right != null){
        		stackLeft.push(node1.left);
            	stackRight.push(node2.right);
        	}else if( (node1.left == null && node2.right != null) || (node1.left != null && node2.right == null) ){
        		return false;
        	}
        	if(node1.right != null && node2.left != null){
        		stackLeft.push(node1.right);
            	stackRight.push(node2.left);
        	}else if( (node1.right == null && node2.left != null) || (node1.right != null && node2.left == null)){
        		return false;
        	}
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
