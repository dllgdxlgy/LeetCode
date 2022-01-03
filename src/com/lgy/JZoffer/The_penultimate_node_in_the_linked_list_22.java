package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

/**
 * @author LGY
 * @create 2022-01-03 14:32
 */
public class The_penultimate_node_in_the_linked_list_22 {


    /**
     * 顺序法
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd1(ListNode head, int k) {

        if (head == null )return head;
        int num = 0;
        ListNode node = head;
        while (node.next != null){
            num++;
            node = node.next;

        }
        if (k>num){
            return head;
        }

        for (int i = 0; i <= num-k; i++) {
            head = head.next;
        }

        return head;
    }

    /**
     * 快慢指针
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {

        ListNode node = head;
        for (int i = 0; i < k ; i++) {
            node = node.next;
        }
        while (node != null){
            head = head.next;
            node = node.next;
        }


        return head;
    }
}
