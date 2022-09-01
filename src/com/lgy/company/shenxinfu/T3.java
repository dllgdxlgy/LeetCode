package com.lgy.company.shenxinfu;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-09-01 20:02
 */
public class T3 {
    public ListNode reverseBetween(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode pre = dummy;
        for(int i = 0;i < 2; i++){
            pre = pre.next;
        }
        ListNode l = pre;

        for(int i = 2; i< 3;i++){
            pre = pre.next;
        }
        ListNode right_node = pre;
        ListNode r = pre.next;
        pre.next = null;

        ListNode left_node = l.next;
        l.next = null;

        right_node = left_node;
        ListNode h =  reverse(left_node);


        l.next = h;
        right_node.next=r;
        return dummy.next;
    }
    public ListNode reverse(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
