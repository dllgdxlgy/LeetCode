package com.lgy.JZoffer;

import com.lgy.JZoffer.entity.ListNode;

import java.nio.file.Watchable;

public class Exchange_the_nodes_in_the_linked_list_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = new ListNode(0);
        ListNode temp = new ListNode(0);
        pre.next= head;
        temp = pre;
        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(0);

        while (temp.next != null && temp.next.next != null){
            node1 =temp.next;
            node2 =temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next =node1;
            temp = node1;


        }


        return pre.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        Exchange_the_nodes_in_the_linked_list_24 wx = new Exchange_the_nodes_in_the_linked_list_24();
        wx.swapPairs(head);
    }
}
