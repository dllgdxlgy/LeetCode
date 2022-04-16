package com.lgy.leetcode;

public class T876 {
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode node = head;
        while (node != null){
            count++;
            node = node.next;
        }
        node = head;
        if (count%2 == 1){
            int temp = count/2;
            for (int i = 0; i < temp; i++) {
                node = node.next;
            }
            return node;
        }else {
            int temp = count/2;
            for (int i = 0; i < temp; i++) {
                node = node.next;
            }
            return node;
        }

    }
}
