package com.lgy.leetcode;

import java.util.HashSet;
import java.util.Set;

public class T160 {
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
