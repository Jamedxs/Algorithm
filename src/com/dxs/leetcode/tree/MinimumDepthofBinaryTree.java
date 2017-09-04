package com.dxs.leetcode.tree;

/**
 * Created by dengxusheng on 2017-09-04.
 * Given a binary tree, find its minimum depth.
     The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

     解析：经典的求解二叉树最小深度的题，使用递归来进行求解。
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;

        if(root.left == null){
            return minDepth(root.right)+1;
        }else if(root.right == null){
            return minDepth(root.left)+1;
        }else{
            return Math.min(minDepth(root.right),minDepth(root.left))+1;
        }
    }
}
