package com.lgy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class T160 {


    /**
     * T160、相交链表
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode_1(ListNode headA, ListNode headB) {

        ListNode temp_A = headA;
        ListNode temp_B = headB;

        while(temp_A != temp_B){
            temp_A = temp_A == null?headB:temp_A.next;
            temp_B = temp_B == null?headA:temp_B.next;
        }
        return temp_A;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){

            if (!set.add(temp)) {
                return temp;
            }
           temp = temp.next;
        }
        return null;
    }
}
