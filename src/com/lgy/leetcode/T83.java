package com.lgy.leetcode;

import java.util.Collections;
import java.util.TreeMap;

public class T83 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null||head.next == null){
            return head;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ListNode temp = head;
        while (temp!=null){

            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        temp = head;

        for (Integer i:map.keySet()) {
            ListNode node = new ListNode(i);
            temp.next = node;
            temp = temp.next;
        }
        return head.next;
    }

    public ListNode deleteDuplicates_1(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        while (node.next != null){
            if (node.val == node.next.val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }

        return head;
    }
}
