package com.dxs.leetcode.List;
/**
 * @author dengxusheng	
 * @version 创建时间：2017年8月1日 上午9:31:40
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
	解析：合并两个已排序的list。
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val < l2.val){
        	l1.next = mergeTwoLists(l1.next,l2);
        	return l1;
        }else{
        	l2.next = mergeTwoLists(l1,l2.next);
        	return l2;
        }
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
