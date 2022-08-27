package com.lgy.leetcode;

/**
 * @author LGY
 * @create 2022-08-27 21:22
 */
public class T2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (l1 != null && l2 != null) {
            s1.insert(0, l1.val);
            s2.insert(0, l2.val);
            l2 = l2.next;
            l1 = l1.next;
        }

        while (l1 == null && l2 != null) {
            s1.insert(0, 0);
            s2.insert(0, l2.val);
            l2 = l2.next;
        }

        while (l1 != null && l2 == null) {
            s1.insert(0, l1.val);
            s2.insert(0, 0);
            l1 = l1.next;
        }
        int len = s1.toString().length() - 1;
        int temp = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while (len >= 0) {
            int sum = temp + s1.charAt(len)-'0' + s2.charAt(len)-'0';
            temp = sum / 10;
            ListNode node = new ListNode(sum % 10);
            head.next = node;
            head = head.next;
            len--;
        }
        if(temp!=0){
            head.next = new ListNode(temp);
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        node.next = node1;
        node2.next = node3;
        T2 t2 = new T2();
        t2.addTwoNumbers(node, node2);

    }
}
