package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author LGY
 * @create 2022-05-24 15:45
 */
public class T52 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> set = new HashSet<>();

        while (headA != null){
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null){
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }
}
