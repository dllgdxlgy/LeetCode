package com.lgy.CodeTop_100;

import com.lgy.JZoffer.entity.ListNode;

/**
 * 相交链表
 * @author LGY
 * @create 2022-07-16 11:05
 */
public class T160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;
        while(l1 != l2){

            l1 = l1!= null? l1.next:headB;
            l2 = l2!= null? l2.next:headA;
        }
        return l1;

    }
}
