package com.dxs.tree;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月2日 上午9:07:35
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
	According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”
	        _______6______
	       /              \
	    ___2__          ___8__
	   /      \        /      \
	   0      _4       7       9
	         /  \
	         3   5
	For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
	解析：判断两个node的最小的共同祖先，如果 都比root小，那里在左边，都比root大，在右边，其余的一边一个的话，就是root。
 */
public class LowestCommonAncestorofaBinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root==null || p==null || q==null) return null;
		if(root.val > p.val && root.val > q.val){
			return lowestCommonAncestor(root.left,p,q);
		}else if(root.val < p.val && root.val < q.val){
			return lowestCommonAncestor(root.right,p,q);
		}else{
			return root;
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
