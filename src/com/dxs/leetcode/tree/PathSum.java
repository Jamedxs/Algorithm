package com.dxs.leetcode.tree;

/**
 * Created by dengxusheng on 2017-08-23.
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
     For example:
     Given the below binary tree and sum = 22,              5
     / \
     4   8
     /   / \
     11  13  4
     /  \      \
     7    2      1
     return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
     解析：从root到leaf的和需要等于sum就返回true。
 */
public class PathSum {
    public static boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }else if(root.left == null && root.right == null && root.val == sum){
            return true;
        }else{
            return hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(hasPathSum(root,1));
    }
}
