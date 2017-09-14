package com.dxs.leetcode.List;

/**
 * Created by dengxusheng on 2017-09-14.
 * Remove all elements from a linked list of integers that have value val.
 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5
 解析：

 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode currNode = head;
        while(currNode.next != null){
            if(currNode.next.val == val){
                currNode.next = currNode.next.next;
            }else{
                currNode = currNode.next;
            }
        }
        return head.val == val ? head.next : head;
    }
}
