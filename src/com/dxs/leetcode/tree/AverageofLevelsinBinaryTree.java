package com.dxs.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {

    public List<Double> averageOfLevelsDFS(TreeNode root) {
        List<Double> sumList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();

        averageLevel(root,0,sumList,countList);

        for (int i = 0; i < sumList.size(); i++) {
            sumList.set(i,sumList.get(i)/countList.get(i));
        }

        return sumList;
    }

    public void averageLevel(TreeNode node,int i,List<Double> sumList,List<Integer> countList){
        if(node == null){
            return;
        }

        if(i < sumList.size()){
            //在旧层中加入新值
            sumList.set(i,sumList.get(i) + node.val);
            countList.set(i,countList.get(i) + 1);
        }else{
            //新的一层新节点
            sumList.add(1.0 * node.val);
            countList.add(1);
        }

        averageLevel(node.left,i+1,sumList,countList);
        averageLevel(node.right,i+1,sumList,countList);

    }


    public List<Double> averageOfLevelsBFS(TreeNode root) {
        List<Double> sumList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            long sum = 0,count = 0;
            Queue<TreeNode> tempQueue = new LinkedList<>();
            //每层循环
            while (!queue.isEmpty()){
                TreeNode node = queue.remove();
                sum += node.val;
                count++;
                if(node.left != null){
                    tempQueue.add(node.left);
                }
                if(node.right != null){
                    tempQueue.add(node.right);
                }
            }
            queue = tempQueue;
            sumList.add(sum * 1.0 / count);
        }
        return sumList;
    }


    public List<Double> averageOfLevelsBFS2(TreeNode root) {
        List<Double> sumList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()){
            long sum = 0,count = 0;
            int size = queue.size();
            //每层循环
            while (size-- > 0){
                TreeNode node = queue.poll();
                sum += node.val;
                count++;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            sumList.add(sum * 1.0 / count);
        }
        return sumList;
    }



}
